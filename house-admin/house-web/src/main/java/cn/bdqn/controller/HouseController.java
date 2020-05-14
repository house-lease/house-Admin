package cn.bdqn.controller;

import cn.bdqn.domain.House;
import cn.bdqn.domain.HouseCareful;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.HouseService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public String queryByHouseId(int pageHouseCareful,Integer houseId, Model model) throws MyException {
        try {
            Result result = new Result();
            //根据id查询房屋详细信息
            House house = houseService.selectByPrimaryKey(houseId);
            model.addAttribute("pageHouseCareful", pageHouseCareful);
            model.addAttribute("house", house);
        } catch (Exception e) {
           e.printStackTrace();
           throw new MyException("网络异常");
        }
        return "mainlist";
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
    @RequestMapping("/modifyById")
    public String modifyById(int pageHouseCareful, HouseCareful houseCareful,Model model) throws MyException {
        try {
            houseService.modifyById(houseCareful);
            model.addAttribute("pageHouseCareful", pageHouseCareful);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("网络错误");
        }
        return "redirect:/house/queryHouseCarefulById";
    }

    /**
     *
     * @param
     * @return
     */
    @RequestMapping("/queryHouseCarefulById")
    public String  queryHouseCarefulById(int pageHouseCareful,Integer houseId , Model model){
       //  PageHelper.startPage(pageCode, 10);//设置分页 每页10条数据
        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(houseId);
     //   PageInfo<HouseCareful> houseCarefulPageInfo = new PageInfo<>(houseCarefuls);
        model.addAttribute("houseCarefuls", houseCarefuls);
        model.addAttribute("pageHouseCareful", pageHouseCareful);
        return "mainlist";
    }
    @RequestMapping("/selectHouseCarefulById")
    public String queryHouseCarefulById(int pageHouseCareful,Integer id, Map<String, Object> map){
        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(id);
        map.put("houseCareful", houseCarefuls.get(0));
        map.put("pageHouseCareful",pageHouseCareful);
        return "mainlist";
    }

}
