package cn.bdqn.service;

import cn.bdqn.domain.User;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * 用户业务层
 */
public interface UserService {


    /**
     * 根据用户id查询
     *
     * @param userId
     * @return
     */
    public User queryByUserId(Integer userId);


    //查询全部及根据用户名模糊查询
    List<User> queryByUser(String username, Integer page, Integer size);

    //根据用户id修改状态
    void updateByState(Integer id);

}
