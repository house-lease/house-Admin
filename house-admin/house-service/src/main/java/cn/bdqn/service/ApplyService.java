package cn.bdqn.service;

import cn.bdqn.domain.Apply;

import java.util.List;

public interface ApplyService {
    //根据认证人名称模糊查询
    List<Apply> queryAll( int page, int size);
    //根据id查询详细信息
    Apply queryById(Integer id);

    //认证通过
    int updatePass(Apply apply);

    //认证驳回
    int updateTurn(Apply apply);
;
}
