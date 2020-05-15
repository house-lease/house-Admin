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
            Address address = addressService.selectById(id);
            model.addAttribute("address",address);
            model.addAttribute("pageAddress",pageAddress);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    @RequestMapping("/insert")
    public String insert(Model model,int pageAddress){
     model.addAttribute("pageAddress",pageAddress);
        return "mainlist";
    }

    /**
     *  添加城市
     */
    @RequestMapping("/insertAddress")
    public String insertAddress(int pageAddress,String address,Integer parentId,Integer state,Model model){
        try {
                Address address1 = addressService.selectByAddress(address);
                if (address1 == null){
                    Address address2 = new Address();
                    address2.setAddress(address);
                    address2.setParentId(parentId);
                    address2.setState(state);
                    addressService.insertAddress(address2);
                    model.addAttribute("pageAddress",pageAddress);
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
    public String updateByDelete(int pageAddress,Model model,Integer id,String address,Integer state,Integer parentId){

        try {
            Address address2 = addressService.selectByAddress(address);
            if (address2== null){
                Address address1 = new Address();
                address1.setId(id);
                address1.setAddress(address);
                address1.setParentId(parentId);
                addressService.updateById(address1);
                model.addAttribute("pageAddress",pageAddress);
                return "redirect:/address/selectAll?pageAddress=1";
            }
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
