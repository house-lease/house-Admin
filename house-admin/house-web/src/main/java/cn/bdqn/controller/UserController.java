package cn.bdqn.controller;

import cn.bdqn.domain.User;
import cn.bdqn.service.UserService;
import cn.bdqn.utils.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 用户Controller
 */

@Controller
@RequestMapping("/user")
public class UserController {


    //用户业务层
    @Autowired
    private UserService userService;

    /**
     * 查询全部及根据用户名模糊查询
     */
    @RequestMapping("/selectByUser")
    public String selectByUser(int pageStart, Model model, String username
            , @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "2") Integer size) {
        try {
            List<User> users = userService.queryByUser(username, page, size);//全部数据
            PageInfo pageInfo = new PageInfo(users);
            if (users != null) {
                model.addAttribute("pageInfo", pageInfo);
                model.addAttribute("pageStart",pageStart);
                model.addAttribute("userList", users);//用户集合
                model.addAttribute("username", username);
                return "mainlist";
            } else {
                return "error";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 查看用户信息
     */
    @RequestMapping("/selectByUserMessage")
    public String selectByUserMessage(int pageUser, Integer id, Model model) {

        try {
            User user = userService.queryByUserId(id);//根据用户id查询

            List<User> userList = new ArrayList<User>();
            userList.add(user);
            model.addAttribute("users", userList);
            model.addAttribute("pageUser", pageUser);
            return "mainlist";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

    /**
     *  查看用户信息
     */
    @RequestMapping("/selectById")
    public String selectById(Integer id, Model model){

        try {
            User user = userService.queryByUserId(id);//根据用户id查询
            System.out.println(user);
            model.addAttribute("user",user);
            return "updateUserByState";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }



    /**
     * 根据用户id修改状态
     */
    @RequestMapping("/updateByState")
    public String updateByState(int pageUser, Integer id, Integer state, Model model) {

        try {
            userService.updateByState(id);
            model.addAttribute("pageUser", pageUser);
            return "redirect:/user/selectByUser";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
