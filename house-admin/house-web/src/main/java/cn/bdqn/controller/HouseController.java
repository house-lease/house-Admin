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

//    /**
//     * 查询房屋方法
//     *
//     * @return
//     */
//    @RequestMapping("/queryHouse")
//    @ResponseBody
//    public Result queryHouse(String address, String houseLeaseName, BigDecimal price, Integer startValue) {
//
//        List<House> houses = new ArrayList<>();
//        try {
//            //调用查询房屋的方法
//            houses = houseService.queryByAddressORLeaseTypeORPriceORStartValue(address, "".equals(houseLeaseName.trim()) ? null : houseLeaseName, price, startValue);
//            Result result = new Result();
//            result.setData(houses);
//            result.setMessage("加载完成");
//            return result;
//        } catch (Exception e) {
//            Result result = new Result();
//            e.printStackTrace();
//            result.setData(null);
//            result.setMessage("网络异常");
//            return result;
//        }
//
//    }
/**
    @RequestMapping("/queryByHouseId")
    public String queryByHouseId(int pageCareful,Integer houseId, Map<String, Object> map) throws MyException {
        try {
            Result result = new Result();
            //根据id查询房屋详细信息
            House house = houseService.selectByPrimaryKey(houseId);
            map.put("house", house);
            map.put("pageCareful", pageCareful);
        } catch (Exception e) {
           e.printStackTrace();
           throw new MyException("网络异常");
        }
        return "mainlist";
    }*/

  @RequestMapping("/queryByHouseId")
  @ResponseBody
  public Result queryByHouseId(Integer houseId) throws MyException {
      Result result = new Result();
      try {

          //根据id查询房屋详细信息
          House house = houseService.selectByPrimaryKey(houseId);
          result.put("house", house);
          result.put("message","success");
      } catch (Exception e) {
          e.printStackTrace();
          throw new MyException("网络异常");
      }
      return result;
  }


    /**
     * 按【id,房东姓名,房屋名称】查询房屋{分页，支持模糊查询}
     *
     * @param model
     * @param houseName
     * @return

    @RequestMapping("/queryByPage")
    public String queryByPage(int pageHouse ,Model model, @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "2") Integer size, String houseName,Integer id,String userName) {
        try {

            List<House> houses = houseService.selectByPage(houseName,id,userName,page,size);
            PageInfo pageInfo = new PageInfo(houses);
            model.addAttribute("housesList", houses);//用户集合
            model.addAttribute("pageInfo", pageInfo);
            model.addAttribute("userName", userName);
            model.addAttribute("houseName", houseName);
            model.addAttribute("pageHouse", pageHouse);
            model.addAttribute("id", id);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }*/
    /**
     * 按【id,房东姓名,房屋名称】查询房屋{分页，支持模糊查询}
     *
     * @param houseName
     * @return
     */
     @RequestMapping("/queryByPage")
     @ResponseBody
     public Result queryByPage( @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "2") Integer size, String houseName,Integer id,String userName) {
         Result result = new Result();
     try {

     List<House> houses = houseService.selectByPage(houseName,id,userName,page,size);
     PageInfo pageInfo = new PageInfo(houses);
         result.put("housesList", houses);//用户集合
         result.put("pageInfo", pageInfo);
         result.put("userName", userName);
         result.put("houseName", houseName);
         result.put("id", id);
         result.put("message","success");
     }catch (Exception e){
        e.printStackTrace();
        result.put("message","error");
     }
         return result;
     }
    /**
     *  根据房屋id查询房屋详情信息
     * @param houseId
     * @param model
     * @return

    @RequestMapping("selectHouseCareful")
    public String selectHouseCarefulByHouseId(int pageHouse,Integer houseId,Model model){
        try {
            HouseCareful houseCareful = houseService.selectHouseCarefulByHouseId(houseId);
            House house =houseService.selectByPrimaryKey(houseId);
            model.addAttribute("house",house);
            model.addAttribute("houseCareful",houseCareful);
            model.addAttribute("pageHouse",pageHouse);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }*/

    /**
     *  根据房屋id查询房屋详情信息
     * @param houseId
     * @return
     */
     @RequestMapping("selectHouseCareful")
     @ResponseBody
     public Result selectHouseCarefulByHouseId(Integer houseId){
         Result result = new Result();
     try {
     HouseCareful houseCareful = houseService.selectHouseCarefulByHouseId(houseId);
     House house =houseService.selectByPrimaryKey(houseId);
         result.put("house",house);
         result.put("houseCareful",houseCareful);
         result.put("message","success");
     }catch (Exception e){
     e.printStackTrace();
         result.put("message","error");
     }
         return result;
     }
    /**
     * 更新房屋详情
     * @param houseCareful
     * @return
     */
    @RequestMapping("/modifyById")
    public String modifyById(int pageCareful,HouseCareful houseCareful,Model model) throws MyException {
        try {
            houseService.modifyById(houseCareful);
            model.addAttribute("pageCareful", pageCareful);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("网络错误");
        }
        return "mainlist";
    }

    /**

    @RequestMapping("/queryHouseCarefulById")
    public String  queryHouseCarefulById(int pageCareful,Integer houseId, Model model){

        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(houseId);

        model.addAttribute("houseCarefuls", houseCarefuls);
        model.addAttribute("pageCareful", pageCareful);
        return "mainlist";
    }*/

    @RequestMapping("/queryHouseCarefulById")
    @ResponseBody
    public Result queryHouseCarefulById(Integer houseId){

        Result result = new Result();
        List<HouseCareful> houseCarefuls=null;
        try {
            houseCarefuls= houseService.selectByHouseId(houseId);
            result.put("houseCarefuls", houseCarefuls);
            result.put("message","success");
        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
        return result;
    }


    /**@RequestMapping("/selectHouseCarefulById")
    public String queryHouseCarefulById(int pageCareful,Integer id, Map<String, Object> map){
        List<HouseCareful> houseCarefuls = houseService.selectByHouseId(id);
        map.put("houseCareful", houseCarefuls.get(0));
        map.put("pageCareful", pageCareful);
        return "mainlist";
    }*/

    @RequestMapping("/selectHouseCarefulById")
    @ResponseBody
    public Result selectHouseCarefulById(Integer id){
        Result result = new Result();
        try {
            List<HouseCareful> houseCarefuls = houseService.selectByHouseId(id);
            result.put("houseCareful", houseCarefuls.get(0));
            result.put("message","success");
        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
        return result;

    }

}
