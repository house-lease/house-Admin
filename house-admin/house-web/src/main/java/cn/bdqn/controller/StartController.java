package cn.bdqn.controller;

import cn.bdqn.domain.Start;
import cn.bdqn.service.StartService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/start")
public class StartController {

    @Autowired
    private StartService startService;

    //分页查询Start全部信息的Controller
    @RequestMapping("/selectAll")
    public String selectByUserId(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size) {
        try {
            List<Start> starts = startService.queryAll(page, size);
            PageInfo pageInfo = new PageInfo(starts);
            model.addAttribute("starts", starts);
            model.addAttribute("pageInfo", pageInfo);
            return "startMain";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    //跳转添加页面的Controller
    @RequestMapping("/addYe")
    public String addYe() {

        return "startInsert";
    }

    //添加的Start
    @RequestMapping("/add")
    public String add(Start start) {
        int count = startService.queryCount(start.getStartName());
        System.out.println(count);
        if (count == 0) {
            startService.save(start);
            return "redirect:/start/selectAll";
        }
        return "redirect:/start/addYe";
    }

    //带数据到修改页面
    @RequestMapping("/updateYe")
    public String updateYe(Integer id, Model model) {
        Start start = startService.selectById(id);
        model.addAttribute("start", start);
        return "startUpdate";
    }

    //修改信息
    @RequestMapping("/update")
    public String update(Start start, Model model) {
        startService.update(start);
        return "redirect:/start/selectAll";
    }


    //根据id删除信息
    @RequestMapping("/delete")
    public String delete(Integer id) {


        startService.delete(id);

        return "redirect:/start/selectAll";
    }
}
