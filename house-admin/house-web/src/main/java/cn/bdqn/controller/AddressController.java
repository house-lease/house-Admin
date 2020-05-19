package cn.bdqn.controller;


import cn.bdqn.domain.Address;
import cn.bdqn.service.AddressService;
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

    /**
     *  查询
     **/
    @RequestMapping("/selectAll")
    public String selectAll(int pageAddress,Model model,String address,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){
        try {
            List<Address> addressList = addressService.queryAll(address,page,size);//查询
            PageInfo pageInfo = new PageInfo(addressList);
            //关联自身查询，添加到集合中
            for (Address address1: addressList) {
                address1.setParentAddress(addressService.selectByPrimaryKey(address1.getParentId()));
            }
            model.addAttribute("addressList",addressList);
            model.addAttribute("pageInfo", pageInfo);
            model.addAttribute("address", address);
            model.addAttribute("pageAddress", pageAddress);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 根据id查询
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/selectById")
    public String selectById(int pageAddress,Integer id,Model model){
        try {
            Address address = addressService.selectById(id);//根据id查询出城市
            List<Address> addressList = addressService.selectAddress();//查询出所有城市

            model.addAttribute("addressList",addressList);
            model.addAttribute("address",address);
            model.addAttribute("pageAddress",pageAddress);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 跳转到添加页面
     * @param model
     * @param pageAddress
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Model model,int pageAddress){
        List<Address> addressList = addressService.selectAddress();//查询出所有城市
        model.addAttribute("addressList",addressList);
        model.addAttribute("pageAddress",pageAddress);
        return "mainlist";
    }

    /**
     *  添加城市
     */
    @RequestMapping("/insertAddress")
    public String insertAddress(int pageAddress,Address address,Model model){
        try {
            int result = addressService.selectByAddress(address.getAddress());
            model.addAttribute("pageAddress",pageAddress);
            if (result == 0){
                Address address2 = new Address();
                address2.setAddress(address.getAddress());
                address2.setParentId(address.getParentId());
                address2.setState(address.getState());
                addressService.insertAddress(address2);
                return "redirect:/address/selectAll?pageAddress=1";
            }
            return "redirect:/address/insert?pageAddress=2";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     *  修改
     */
    @RequestMapping("/updateByDelete")
    public String updateByDelete(int pageAddress,Model model,Address address){

        try {
            int result = addressService.selectByAddress(address.getAddress());
            model.addAttribute("pageAddress",pageAddress);
            if (result == 0){
                Address address1 = new Address();
                address1.setId(address.getId());
                address1.setAddress(address.getAddress());
                address1.setParentId(address.getParentId());
                addressService.updateById(address1);
                return "redirect:/address/selectAll?pageAddress=1";
            }
            int id =address.getId();
            model.addAttribute("id",id);
            return "redirect:/address/selectById?pageAddress=3";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     *  修改状态
     */
    @RequestMapping("/deleteByState")
    public String deleteByState(int pageAddress, Integer id, Model model){

        addressService.deleteById(id);
        model.addAttribute("pageAddress", pageAddress);
        return "redirect:/address/selectAll";

    }

}
