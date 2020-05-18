package cn.bdqn.controller;

import cn.bdqn.domain.Start;
import cn.bdqn.service.StartService;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.rmi.MarshalledObject;
import java.util.List;

@Controller
@RequestMapping("/start")
public class StartController {

    @Autowired
    private StartService startService;

    //分页查询Start全部信息的Controller
    @RequestMapping("/selectAll")
    public String selectByUserId(int pageStart,Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size) {
        try {
            List<Start> starts = startService.queryAll(page, size);
            PageInfo pageInfo = new PageInfo(starts);

            model.addAttribute("starts", starts);
            model.addAttribute("pageInfo", pageInfo);
            model.addAttribute("pageStart",pageStart);
            return "mainlist";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    //跳转到添加页面
  @RequestMapping("/addYe")
   public  String addYe(int pageStart,Model model){

        model.addAttribute("pageStart",pageStart);
        return "mainlist";
   }

    //添加的Start
    @RequestMapping("/add")
    public String add(int pageStart, Start start, Model model) {
        try{
            //验证是否与数据库数据重复
            int count = startService.queryCount(start.getStartName(),start.getStartValue());
            model.addAttribute("pageStart",pageStart);
            if (count == 0) {
                startService.save(start);
                return "redirect:/start/selectAll";
            }
        }catch (Exception e){
            e.printStackTrace();

        }
        return "redirect:/start/addYe?pageStart=0";

    }

    //带数据到修改页面
    @RequestMapping("/updateYe")
    public String updateYe(int pageStart,Integer id, Model model) {
        Start start = startService.selectById(id);
        model.addAttribute("pageStart",pageStart);
        model.addAttribute("start", start);
        return "mainlist";
    }

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
        return "redirect:/start/updateYe?pageStart=2";
    }


    //根据id删除信息
    @RequestMapping("/delete")
    public String delete(int pageStart, Integer id, Model model) {
        startService.delete(id);
        model.addAttribute("pageStart",pageStart);
        return "redirect:/start/selectAll";
    }
}
