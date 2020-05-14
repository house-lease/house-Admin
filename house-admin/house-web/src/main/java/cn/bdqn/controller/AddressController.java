package cn.bdqn.controller;


import cn.bdqn.domain.Address;
import cn.bdqn.service.AddressService;
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
     *  查询
     **/
    @RequestMapping("/selectAll")
    public String selectAll(Model model,String address){
        try {
            List<Address> addressList = addressService.queryAll(address);//查询
            model.addAttribute("addressList",addressList);
            return "addressList";
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
    public String selectById(Integer id,Model model){
        try {
            Address address = addressService.selectById(id);
            model.addAttribute("address",address);
            return "addressUpdate";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    @RequestMapping("/insert")
    public String insert(){
        return "addressInsert";
    }

    /**
     *  添加城市
     */
    @RequestMapping("/insertAddress")
    public String insertAddress(String address,Integer parentId,Integer state){
        try {
                Address address1 = addressService.selectByAddress(address);
                if (address1 == null){
                    Address address2 = new Address();
                    address2.setAddress(address);
                    address2.setParentId(parentId);
                    address2.setState(state);
                    addressService.insertAddress(address2);
                    return "addressList";
                }
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/address/selectAll";
    }

    /**
     *  修改
     */
    @RequestMapping("/updateByDelete")
    public String updateByDelete(Integer id,String address,Integer state,Integer parentId){

        try {
                Address address1 = new Address();
                address1.setId(id);
                address1.setAddress(address);
                address1.setParentId(parentId);
                address1.setState(state);
                addressService.updateById(address1);
                return "addressList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }



}
