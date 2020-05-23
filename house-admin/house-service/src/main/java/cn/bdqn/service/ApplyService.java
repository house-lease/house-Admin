package cn.bdqn.service;

import cn.bdqn.domain.Apply;

import java.util.List;

public interface ApplyService {
    //根据认证人名称模糊查询
    List<Apply> queryByUserName(String userName, int page, int size);
    //根据id查询详细信息
    Apply queryById(Integer id);

    //根据userId修改apply表信息
    void updateById(Integer userId);
;
}
