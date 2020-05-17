package cn.bdqn.controller;

import cn.bdqn.domain.Administrator;
import cn.bdqn.exception.MyException;
import cn.bdqn.service.AdministratorService;
import cn.bdqn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/admin")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @RequestMapping("/login")
    @ResponseBody
    public Result<Map<String, Object>> login(@RequestBody Map<String,String> param) throws MyException {
        Result<Map<String, Object>> result = new Result<>();
        try {
            Administrator administrator = administratorService.login(param.get("name"), param.get("password"));
            Map<String, Object> map = new HashMap<>();
            if(administrator != null){
                map.put("admin",administrator);
                String token = UUID.randomUUID().toString();
                map.put("token", token);
                map.put("success", "200");
                result.setMessage("登录成功");
                result.setData(map);
            }else{
                result.setMessage("登录失败, 账号或密码输入错误");
            }
        }catch(Exception e){
            e.printStackTrace();
            result.setMessage("网络异常");
            throw new MyException("网络异常");
        }
        return result;
    }
}
