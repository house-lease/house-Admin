package cn.bdqn.mapper;

import cn.bdqn.domain.User;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 用户接口
 */
public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

//    根据id查询
    void insert(User record);

//    根据openid查询用户
    public User selectByOpenId(String openId);



// 总条数
    int count();

//查询全部
    List<User> selectByUser(@Param("username") String username);

    int insertSelective(User record);

//    根据用户id查询用户
    User selectByPrimaryKey(Integer id);

    //根据用户id修改状态
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}