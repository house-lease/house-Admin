package cn.bdqn.controller;


import cn.bdqn.domain.Address;
import cn.bdqn.service.AddressService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 *    城市
 */
@RequestMapping("/address")
@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

//    /**
//     *  查询
//     **/
//    @RequestMapping("/selectAll")
//    public String selectAll(int pageAddress,Model model,String address,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){
//        try {
//            List<Address> addressList = addressService.queryAll(address,page,size);//查询
//            PageInfo pageInfo = new PageInfo(addressList);
//            //关联自身查询，添加到集合中
//            for (Address address1: addressList) {
//                address1.setParentAddress(addressService.selectByPrimaryKey(address1.getParentId()));
//            }
//            model.addAttribute("addressList",addressList);
//            model.addAttribute("pageInfo", pageInfo);
//            model.addAttribute("address", address);
//            model.addAttribute("pageAddress", pageAddress);
//            return "mainlist";
//        }catch (Exception e){
//            e.printStackTrace();
//            return "error";
//        }
//    }


//    /**
//     * 根据id查询
//     * @param id
//     * @param model
//     * @return
//     */
//    @RequestMapping("/selectById")
//    public String selectById(int pageAddress,Integer id,Model model){
//        try {
//            Address address = addressService.selectById(id);//根据id查询出城市
//            List<Address> addressList = addressService.selectAddress();//查询出所有城市
//
//            model.addAttribute("addressList",addressList);
//            model.addAttribute("address",address);
//            model.addAttribute("pageAddress",pageAddress);
//            return "mainlist";
//        }catch (Exception e){
//            e.printStackTrace();
//            return "error";
//        }
//
//    }

//    /**
//     * 跳转到添加页面
//     * @param model
//     * @param pageAddress
//     * @return
//     */
//    @RequestMapping("/insert")
//    public String insert(Model model,int pageAddress){
//        List<Address> addressList = addressService.selectAddress();//查询出所有城市
//        model.addAttribute("addressList",addressList);
//        model.addAttribute("pageAddress",pageAddress);
//        return "mainlist";
//    }

//    /**
//     *  添加城市
//     */
//    @RequestMapping("/insertAddress")
//    public String insertAddress(int pageAddress,Address address,Model model){
//        try {
//            int result = addressService.selectByAddress(address.getAddress());
//            model.addAttribute("pageAddress",pageAddress);
//            if (result == 0){
//                addressService.insertAddress(address);
//                return "redirect:/address/selectAll?pageAddress=1";
//            }
//            return "redirect:/address/insert?pageAddress=2";
//        }catch (Exception e){
//            e.printStackTrace();
//            return "error";
//        }
//    }

//    /**
//     *  修改
//     */
//    @RequestMapping("/updateByDelete")
//    public String updateByDelete(int pageAddress,Model model,Address address){
//
//        try {
//            int result = addressService.selectByAddress(address.getAddress());
//            model.addAttribute("pageAddress",pageAddress);
//            if (result == 0){
//
//                addressService.updateById(address);
//                return "redirect:/address/selectAll?pageAddress=1";
//            }
//            int id =address.getId();
//            model.addAttribute("id",id);
//            return "redirect:/address/selectById?pageAddress=3";
//        }catch (Exception e){
//            e.printStackTrace();
//            return "error";
//        }
//    }

//    /**
//     *  修改状态
//     */
//    @RequestMapping("/deleteByState")
//    public String deleteByState(int pageAddress, Integer id, Model model){
//
//        addressService.deleteById(id);
//        model.addAttribute("pageAddress", pageAddress);
//        return "redirect:/address/selectAll";
//
//    }


    /**
     *  查询
     **/
    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectAll(String address, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){
        Result  result =new Result();
        try {
            List<Address> addressList = addressService.queryAll(address,page,size);//查询
            PageInfo pageInfo = new PageInfo(addressList);
            //关联自身查询，添加到集合中
            for (Address address1: addressList) {
                address1.setParentAddress(addressService.selectByPrimaryKey(address1.getParentId()));
            }
            result.put("addressList",addressList);
            result.put("pageInfo", pageInfo);
            result.put("address", address);
            result.put("message","success");

        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");

        }
        return result;
    }

    /**
     *  修改状态
     */
    @RequestMapping("/deleteByState")
    @ResponseBody
    public Result deleteByState(Integer id){
        Result  result =new Result();
        try{
            addressService.deleteById(id);
            result.put("message","success");
        }catch (Exception e){
            result.put("message","error");

        }
        return result;
    }



    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/selectById")
    @ResponseBody
    public Result selectById(Integer id){
        Result  result =new Result();
        try {
            Address address = addressService.selectById(id);//根据id查询出城市
            List<Address> addressList = addressService.selectAddress();//查询出所有城市
            result.put("addressList",addressList);
            result.put("address",address);
            result.put("message","success");

        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
        return result;
    }
    /**
     * 跳转到添加页面
     */
    @RequestMapping("/insert")
    @ResponseBody
    public Result insert(){
        Result  result =new Result();
        try{
            List<Address> addressList = addressService.selectAddress();//查询出所有城市
            result.put("addressList",addressList);
            result.put("message","success");
        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
        return result;
    }


    /**
     *  添加城市
     */
    @RequestMapping("/insertAddress")
    @ResponseBody
    public Result insertAddress(Address address){
        Result results =new Result();
        try {
            int result = addressService.selectByAddress(address.getAddress());
            if (result == 0){
                addressService.insertAddress(address);
                results.put("message","success");
                return results;
            }else {
                results.put("message","添加失败(该数据已存在)");
            }
        }catch (Exception e){
            e.printStackTrace();
            results.put("message","error");
        }
        return results;
    }

    /**
     *  修改
     */
    @RequestMapping("/updateByDelete")
    @ResponseBody
    public Result updateByDelete(Address address){
        Result results =new Result();
        try {
            int result = addressService.selectByAddress(address.getAddress());
            if (result == 0){
                addressService.updateById(address);
                results.put("message","success");
            }
            int id =address.getId();
            results.put("id",id);
            results.put("message","修改失败(该数据已存在)");
        }catch (Exception e){
            e.printStackTrace();
            results.put("message","error");
        }
        return  results;
    }

}
