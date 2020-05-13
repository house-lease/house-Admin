package cn.bdqn.controller;

import cn.bdqn.domain.House;
import cn.bdqn.domain.HouseCareful;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.HouseService;
import cn.bdqn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/house")
public class HouseController {

    //房屋业务类
    @Autowired
    private HouseService houseService;

    /**
     * 查询房屋方法
     *
     * @return
     */
    @RequestMapping("/queryHouse")
    @ResponseBody
    public Result queryHouse(String address, String houseLeaseName, BigDecimal price, Integer startValue) {

        List<House> houses = new ArrayList<>();
        try {
            //调用查询房屋的方法
            houses = houseService.queryByAddressORLeaseTypeORPriceORStartValue(address, "".equals(houseLeaseName.trim()) ? null : houseLeaseName, price, startValue);
            Result result = new Result();
            result.setData(houses);
            result.setMessage("加载完成");
            return result;
        } catch (Exception e) {
            Result result = new Result();
            e.printStackTrace();
            result.setData(null);
            result.setMessage("网络异常");
            return result;
        }

    }

    @RequestMapping("/queryByHouseId")
    public String queryByHouseId(Integer houseId, Map<String, Object> map) throws MyException {
        try {
            Result result = new Result();
            //根据id查询房屋详细信息
            House house = houseService.selectByPrimaryKey(houseId);
            map.put("house", house);
        } catch (Exception e) {
           e.printStackTrace();
           throw new MyException("网络异常");
        }
        return "houseDetaileInfo";
    }


    /**
     * 按【id,房东姓名,房屋名称】查询房屋{分页，支持模糊查询}
     *
     * @param model
     * @param houseName
     * @return
     */
    @RequestMapping("/queryByPage")
    public String queryByPage(Integer pageStart,Model model, @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size, String houseName,Integer id,String userName) {
        try {
            List<House> houses = houseService.selectByPage(houseName,id,userName,page,size);
            model.addAttribute("housesList", houses);//用户集合
            return "houselist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     *  根据房屋id查询房屋详情信息
     * @param houseId
     * @param model
     * @return
     */
    @RequestMapping("selectHouseCareful")
    public String selectHouseCarefulByHouseId(Integer houseId,Model model){
        try {
            HouseCareful houseCareful = houseService.selectHouseCarefulByHouseId(houseId);
            model.addAttribute("houseCareful",houseCareful);
            return "houseCareful";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }


    /**
     * 更新房屋详情
     * @param houseCareful
     * @return
     */
    @RequestMapping
    @ResponseBody
    public Result<String> modifyById(HouseCareful houseCareful) {
        Result<String> result = new Result<>();
        try {
            houseService.modifyById(houseCareful);
            result.setData("更新成功");
            result.setMessage("success");
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("error");
            result.setData("网络异常");
        }
        return result;
    }
}
