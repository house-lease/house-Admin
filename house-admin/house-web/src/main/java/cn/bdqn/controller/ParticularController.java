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
     * 根据用户id查询充值记录
     * @param userId
     * @return
     */
    @RequestMapping("/selectByUserId")
    public String selectByUserId(int pageParticularByUserId, Model model, Integer userId, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size){
        try {

            List<Particular> particulars = particularService.queryByUserId(userId,page,size);
            PageInfo pageInfo = new PageInfo(particulars);
            model.addAttribute("particulars",particulars);
            model.addAttribute("pageInfo",pageInfo);
            model.addAttribute("userId",userId);
            model.addAttribute("pageParticularByUserId",pageParticularByUserId);
            return "mainlist";
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
     * 根据充值id查询
     * @param id
     * @return
     */
    @RequestMapping("/selectById")

    public String selectById(int pageParticularById,Model model,Integer id){
        try {
            Particular particular = particularService.queryByPrimaryKey(id);

            model.addAttribute("particular",particular);
            model.addAttribute("id",id);
            model.addAttribute("pageParticularById",pageParticularById);
            return "mainlist";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


}
