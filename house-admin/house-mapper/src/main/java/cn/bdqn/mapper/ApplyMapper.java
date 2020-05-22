package cn.bdqn.mapper;

import cn.bdqn.domain.Apply;

import java.util.List;

public interface ApplyMapper {

    //根据认证人名称模糊查询
    List<Apply> selectByUserName(String userName);
    //根据id查询详细信息
    Apply selectById(Integer id);
    //根据userId修改信息
    void updateById(Integer userId);


}