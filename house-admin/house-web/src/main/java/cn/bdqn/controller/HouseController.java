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
        return "houseCarefulDetails";
    }


    /**
     * 按条件查询房屋{分页，支持模糊查询}
     *
     * @param model
     * @param pageCode
     * @param houseName
     * @return
     */
    @RequestMapping("/queryByPage")
    @ResponseBody
    public String queryByPage(Model model, Integer pageCode, String houseName) {

        PageHelper.startPage(pageCode, 10);//设置分页 每页10条数据
        List<House> houses = houseService.selectByPage(houseName);//全部数据

        PageInfo<House> housePageInfo = new PageInfo<House>(houses);
        houses = housePageInfo.getList();
        Integer totalPage = housePageInfo.getPages();//总页数

        if (houses != null) {
            model.addAttribute("pageCode", pageCode);//当前页
            model.addAttribute("total", totalPage);//总页数
            model.addAttribute("housesList", housePageInfo);//用户集合
            return "houseList";
        }
        return "error";
    }

    /**
     * 根据房东查询房屋
     */
    @RequestMapping("/selectByUserName")
    @ResponseBody
    public String selectByUserName(String userName, Model model) {

        try {
            House house = houseService.selectByUserName(userName);
            if (house != null) {
                model.addAttribute("house", house);
                return "houseList";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "";
    }

    /**
     * 更新房屋详情
     * @param houseCareful
     * @return
     */
    @RequestMapping("/modifyById")
    public String modifyById(HouseCareful houseCareful) throws MyException {
        try {
            houseService.modifyById(houseCareful);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("网络错误");
        }
        return "redirect: queryHouseCarefulById";
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/queryHouseCarefulById")
    public String  queryHouseCarefulById(Integer id,@RequestParam(defaultValue = "1") Integer pageCode, Model model){
        PageHelper.startPage(pageCode, 10);//设置分页 每页10条数据
        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(pageCode);
        PageInfo<HouseCareful> houseCarefulPageInfo = new PageInfo<>(houseCarefuls);
        model.addAttribute("houseCarefulPageInfo", houseCarefulPageInfo);
        return "houseCarefulAllInfo";
    }
    @RequestMapping("/selectHouseCarefulById")
    public String queryHouseCarefulById(Integer id, Map<String, Object> map){
        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(id);
        map.put("houseCareful", houseCarefuls.get(0));
        return "changeHouseCaregul";
    }

}