package cn.bdqn.mapper;

import cn.bdqn.domain.Apply;

import java.util.List;

public interface ApplyMapper {

    //根据认证人名称模糊查询
    List<Apply> selectAll();
    //根据id查询详细信息
    Apply selectById(Integer id);
    //认证通过
    int updatePass(Apply apply);

    //认证驳回
    int updateTurn(Apply apply);
}