package cn.bdqn.service.impl;

import cn.bdqn.domain.Money;
import cn.bdqn.domain.User;
import cn.bdqn.mapper.MoneyMapper;
import cn.bdqn.mapper.UserMapper;
import cn.bdqn.service.UserService;
import cn.bdqn.utils.HttpClientUtil;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    //    用户接口
    @Autowired
    private UserMapper userMapper;

    //可以资金接口
    @Autowired
    private MoneyMapper moneyMapper;


    //根据用户id查询
    @Override
    public User queryByUserId(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }


    //查询全部及根据用户名模糊查询
    @Override
    public List<User> queryByUser(String username, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        return userMapper.selectByUser(username);
    }

    //根据用户id修改状态
    @Override
    public void updateByState(Integer id) {
        userMapper.updateByPrimaryKeySelective(id);
    }


}
