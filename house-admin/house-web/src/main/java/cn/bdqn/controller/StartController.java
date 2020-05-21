package cn.bdqn.controller;

import cn.bdqn.domain.Start;
import cn.bdqn.service.StartService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.rmi.MarshalledObject;
import java.util.List;

@Controller
@RequestMapping("/start")
public class StartController {

    @Autowired
    private StartService startService;

//    //分页查询Start全部信息的Controller
//    @RequestMapping("/selectAll")
//    public String selectByUserId(int pageStart,Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size) {
//        try {
//            List<Start> starts = startService.queryAll(page, size);
//            PageInfo pageInfo = new PageInfo(starts);
//
//            model.addAttribute("starts", starts);
//            model.addAttribute("pageInfo", pageInfo);
//            model.addAttribute("pageStart",pageStart);
//            return "mainlist";
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "error";
//        }
//    }

    //跳转到添加页面
   @RequestMapping("/addYe")
   public  String addYe(int pageStart,Model model){

        model.addAttribute("pageStart",pageStart);
        return "mainlist";
   }

//    //添加的Start
//    @RequestMapping("/add")
//    public String add(int pageStart, Start start, Model model) {
//        try{
//            //验证是否与数据库数据重复
//            int count = startService.queryCount(start.getStartName(),start.getStartValue());
//            model.addAttribute("pageStart",pageStart);
//            if (count == 0) {
//                startService.save(start);
//                return "redirect:/start/selectAll";
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//
//        }
//        return "redirect:/start/addYe?pageStart=0";
//
//    }

//    //带数据到修改页面
//    @RequestMapping("/updateYe")
//    public String updateYe(int pageStart,Integer id, Model model) {
//        Start start = startService.selectById(id);
//        model.addAttribute("pageStart",pageStart);
//        model.addAttribute("start", start);
//        return "mainlist";
//    }

    //修改信息
    @RequestMapping("/update")
    public String update(int pageStart,Start start, Model model) {
        try {
            //验证是否与数据库数据重复

            int count = startService.queryCount(start.getStartName(), start.getStartValue());
            model.addAttribute("pageStart", pageStart);
            if (count == 0) {
            startService.update(start);
            return "redirect:/start/selectAll";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int id= start.getId();
        model.addAttribute("id",id);
        return "redirect:/start/updateYe?pageStart=2";
    }


//    //根据id删除信息
//    @RequestMapping("/delete")
//    public String delete(int pageStart, Integer id, Model model) {
//        startService.delete(id);
//        model.addAttribute("pageStart",pageStart);
//        return "redirect:/start/selectAll";
//    }


    //分页查询Start全部信息的Controller
    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectByUserId(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size) {
        Result  result =new Result();
        try {
            List<Start> starts = startService.queryAll(page, size);
            PageInfo pageInfo = new PageInfo(starts);
            result.put("starts", starts);
            result.put("pageInfo", pageInfo);
            result.put("message","success");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("message","error");
        }
        return  result;
    }


    //根据id删除信息
    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id) {
      Result  result =new Result();
      try {

          startService.delete(id);
          result.put("message","success");

      }catch (Exception e){
          e.printStackTrace();
          result.put("message","error");
      }
        return  result;

    }


    //添加的Start
    @RequestMapping("/add")
    @ResponseBody
    public Result add(Start start) {
        Result  result =new Result();
        try{
            //验证是否与数据库数据重复
            int count = startService.queryCount(start.getStartName(),start.getStartValue());
            if (count == 0) {
                startService.save(start);
                result.put("message","success");
            }else {
                result.put("message","添加失败(该数据已存在)");
            }
        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
       return result;

    }


    //带数据到修改页面
    @RequestMapping("/updateYe")
    @ResponseBody
    public Result updateYe(Integer id) {
        Result  result =new Result();
        try {
            Start start = startService.selectById(id);
            result.put("start",start);
            result.put("message","success");
        }catch (Exception e){
            e.printStackTrace();
            result.put("message","error");
        }
        return result;
    }

}
