package cn.bdqn.mapper;

import cn.bdqn.domain.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户接口
 */
public interface UserMapper {


    //查询全部及根据用户名模糊查询
    List<User> selectByUser(@Param("username") String username);


    //    根据用户id查询用户
    User selectByPrimaryKey(Integer id);

    //根据用户id修改状态
    void updateByPrimaryKeySelective(Integer id);

}