package cn.bdqn.controller;


import cn.bdqn.domain.Apply;

import cn.bdqn.service.ApplyService;

import cn.bdqn.utils.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@RequestMapping("/apply")
@Controller
public class ApplyController {
    @Autowired
    private ApplyService applyService;

//    /**
//     *  根据认证人名称模糊查询
//     **/
//    @RequestMapping("/selectByUserName")
//    @ResponseBody
//    public Result selectByUserName(String userName,
//                                   @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "1") int size,
//                                   @RequestBody Map<String, Object> body){
//        userName = userName == null ? (String) body.get("userName") : userName;
//        page = body.get("pageCode")  ==null  ? page : (Integer) body.get("pageCode") ;
//        size = body.get("size")  ==null  ? size : (Integer) body.get("size") ;
//        System.out.println(body);
//        Result  result =new Result();
//        try {
//
//            List<Apply>  applies= applyService.queryByUserName(userName,page,size);//查询
//            PageInfo pageInfo = new PageInfo(applies);
//           result.put("applies",applies);
//           result.put("pageInfo",pageInfo);
//           result.put("userName",userName);
//           result.put("message","success");
//        }catch (Exception e){
//            e.printStackTrace();
//            result.put("message","error");
//        }
//        return result;
//    }
//
//    /**
//     *  根据id查询详细信息
//     **/
//    @RequestMapping("/selectAll")
//    @ResponseBody
//    public Result selectAll(Integer id,@RequestBody Map<String, Object> body){
//        id = id == null ? (Integer) body.get("id") : id;
//        System.out.println(body);
//        Result  result =new Result();
//        try {
//            Apply applies= applyService.queryById(id);//查询
//            result.put("applies",applies);
//            result.put("id",id);
//            result.put("message","success");
//        }catch (Exception e){
//            e.printStackTrace();
//            result.put("message","error");
//        }
//        return result;
//    }
//
//    /**
//     *   根据userId修改信息
//     */
//    @RequestMapping("/deleteById")
//    @ResponseBody
//    public Result deleteById(Integer userId,@RequestBody Map<String, Object> body){
//        userId = userId == null ? (Integer) body.get("userId") : userId;
//        System.out.println(body);
//        Result  result =new Result();
//        try{
//            applyService.updateById(userId);
//            result.put("message","success");
//        }catch (Exception e){
//            result.put("message","error");
//        }
//        return result;
//    }




    @RequestMapping("/selectAll")
    public String selectByUserName(
                                   @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "2") int size,
                                   Model model){

        try {
            Result result = new Result();
            List<Apply>  applies= applyService.queryAll(page,size);//查询
            PageInfo pageInfo = new PageInfo(applies);
            model.addAttribute("applies",applies);
            model.addAttribute("pageInfo",pageInfo);
            result.put("pageInfo", pageInfo);
            result.put("applies", applies);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "ApplyList";
    }
    @RequestMapping("/queryAll")
    @ResponseBody
    public Result queryAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "2") int size,
            @RequestBody Map<String, Object> map){
            page = map.get("pageCode") == null ? page : (int)map.get("pageCode");
            size = map.get("size") == null ? size : (int)map.get("size");
        Result result = new Result();
        try {
            List<Apply>  applies= applyService.queryAll(page,size);//查询
            PageInfo pageInfo = new PageInfo(applies);
            result.put("pageInfo", pageInfo);
            result.put("applies", applies);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


        /**
     *  根据id查询详细信息
     **/
    @RequestMapping("/selectById")
    @ResponseBody
    public Result selectById(Integer id, @RequestBody Map<String, Integer> body){
        id = body.get("id") == null ? id : body.get("id");
        System.out.println(id);
        Result result = new Result();
        try {
            Apply applies= applyService.queryById(id);//查询
            System.out.println(applies.getUser().getIdcard());//user为空
            result.put("success", 200);
            result.put("applies", applies);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }


        /**
     *   认证通过
     */
    @RequestMapping("/updatePass")
    public String updatePass(Apply apply,Model model){
        try{
                applyService.updatePass(apply);
        }catch (Exception e){
           e.printStackTrace();
        }
        return "redirect:/apply/selectAll";
    }


    /**
     *   驳回认证
     */
    @RequestMapping("/updateTurn")
    public String updateTurn(Apply apply,Model model){
        try{
            applyService.updateTurn(apply);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/apply/selectAll";
    }
}
