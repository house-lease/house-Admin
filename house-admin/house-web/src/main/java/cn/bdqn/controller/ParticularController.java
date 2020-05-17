package cn.bdqn.controller;

import cn.bdqn.domain.Particular;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.ParticularService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageInfo;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 充值记录请求的controller
 */
@Controller
@RequestMapping("/particular")
public class ParticularController {


    @Autowired
    private ParticularService particularService;

    /**
     * 查询充值记录
     * @param phone
     * @return
     */
    @RequestMapping("/selectByUserId")
    public String selectByUserId(Integer id,int pageParticular, Model model, String phone, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){

        if(id==null){

            List<Particular> particulars = particularService.queryByUserId(phone,page,size);
            PageInfo pageInfo = new PageInfo(particulars);
            model.addAttribute("particulars",particulars);
            model.addAttribute("pageInfo",pageInfo);
            model.addAttribute("phone",phone);
            model.addAttribute("pageParticular",pageParticular);
            return "mainlist";
        }else if(phone == null|| phone==""){

            List<Particular> particulars = particularService.queryByPrimaryKey(id);
            model.addAttribute("particulars",particulars);
            model.addAttribute("id",id);
            model.addAttribute("pageParticular",pageParticular);
            return "mainlist";
        }else if(phone!=null ||phone !="" &&id!=null){
            List<Particular> particulars = particularService.queryByIdAndPhone(phone, id);
            model.addAttribute("particulars",particulars);
            model.addAttribute("id",id);
            model.addAttribute("phone",phone);
            model.addAttribute("pageParticular",pageParticular);
            return "mainlist";
        }else {
            return "error";
        }


    }
}
