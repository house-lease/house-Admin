package cn.bdqn.controller;

import cn.bdqn.domain.Particular;
import cn.bdqn.domain.Start;
import cn.bdqn.service.ParticularService;
import cn.bdqn.service.StartService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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

    @RequestMapping("/selectAll")
    public String selectByUserId(Model model,@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){
        try {
            List<Start> starts =startService.queryAll(page, size);
            PageInfo pageInfo = new PageInfo(starts);
            model.addAttribute("starts",starts);
            model.addAttribute("pageInfo",pageInfo);
            return "start";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
