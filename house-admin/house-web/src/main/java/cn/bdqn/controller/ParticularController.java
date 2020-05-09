package cn.bdqn.controller;

import cn.bdqn.domain.Particular;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.ParticularService;
import cn.bdqn.utils.Result;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
     * 根据用户id查询充值记录
     * @param userId
     * @return
     */
    @RequestMapping("/selectByUserId")
    public String selectByUserId(Model model,Integer userId){
        try {
            List<Particular> particulars = particularService.queryByUserId(userId);
            model.addAttribute("particulars",particulars);
            model.addAttribute("userId",userId);
            return "particular";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(Integer id){
        Result results = new Result<>();
        try {
            //更新状态实现删除效果
            particularService.updateById(id);
            results.setMessage("删除成功~");
            return results;
        }catch (Exception e){
            e.printStackTrace();
            results.setMessage("删除失败~");
            return results;
        }

    }

    /**
     * 根据订单id查询
     * @param id
     * @return
     */
    @RequestMapping("/selectById")

    public String selectById(Model model,Integer id){
        try {
            Particular particular = particularService.queryByPrimaryKey(id);
            System.out.println(id);
            model.addAttribute("particular",particular);
            model.addAttribute("id",id);
            return "particularById";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


}
