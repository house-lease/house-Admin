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
import java.util.List;
import java.util.Map;

/**
 *  用户Controller
 */

@Controller
@RequestMapping("/user")
public class UserController {


    //用户业务层
    @Autowired
    private UserService userService;

    /**
     * 登录方法
     * @param code  临时令牌
     * @param image_url 图片路径
     * @param nickName  昵称
     * @param sex  性别
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(String code, String image_url, String nickName, Integer sex){

        try {
            //登录的方法
            User user = userService.login(code,image_url,nickName,sex);
            Result result = new Result();
            result.setData(user);
            result.setMessage("登录成功");
            return result;
        }catch (Exception e){
            e.printStackTrace();
            Result result = new Result();
            result.setData(null);
            result.setMessage("登录失败");
            return result;
        }

    }

    /**
     * 查询全部
     */
    @RequestMapping("/selectByUser")
    @ResponseBody
    public String selectByUser(Model model, String username
                           , @RequestParam(defaultValue = "1", value = "currentPage") Integer pageCode){

        PageHelper.startPage(pageCode,10);//设置分页 每页16条数据
        List<User> users = userService.queryByUser(username);//全部数据

        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        users = userPageInfo.getList();
        Integer totalPage = userPageInfo.getPages();//总页数

        if (users != null){
            model.addAttribute("pageCode",pageCode);//当前页
            model.addAttribute("total",totalPage);//总页数
            model.addAttribute("userList",users);//用户集合
            return "userList";
        }
        return "index";
    }


    /**
     *  查看用户信息
     */
    @RequestMapping("/selectByUserMessage")
    @ResponseBody
    public String selectByUserMessage(Integer id, Model model){

        try {
            User user = userService.queryByUserId(id);//根据用户id查询
            model.addAttribute("users",user);
            return "userMessage";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     *  根据用户id修改状态
     */
    @RequestMapping("/updateByState")
    @ResponseBody
    public String updateByState(Integer id ,Integer state){

        User user = new User();
        user.setId(id);
        user.setState(state);
        try{
            Integer result = userService.updateByState(user);
            return "userList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
