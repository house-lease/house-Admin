package cn.bdqn.controller;


import cn.bdqn.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
     *  查询全部
     **/
    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(Model model){

        try {
            List<Address> addressList = addressService.queryAll();//查询全部信息
            model.addAttribute("addressList",addressList);
            System.out.println(addressList);//打印
            return "addressList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     *  添加城市
     */
    @RequestMapping("/insert")
    @ResponseBody
    public String insertAddress(String address,Integer state){

        Address address1 = new Address();
        address1.setAddress(address);
        address1.setState(state);
        try {
            if (address1!=null){
                addressService.insertAddress(address1);
            }
            return "addressList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     *  修改
     */
    @RequestMapping("updateByDelete")
    @ResponseBody
    public String updateByDelete(Integer id,String address,Integer state){

        Address address1 = new Address();
        address1.setId(id);
        address1.setAddress(address);
        address1.setState(state);
        try {
            if(address1 != null){
                addressService.updateById(address1);
            }
            return "addressList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }



}
