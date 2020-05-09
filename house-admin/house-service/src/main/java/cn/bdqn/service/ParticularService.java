package cn.bdqn.service;

import cn.bdqn.domain.Particular;

import java.util.List;

public interface ParticularService {



    //根据id查询
    Particular queryByPrimaryKey(Integer id);


    //    根据id删除
    void updateById(Integer id);

    //    根据用户id查询
    public List<Particular> queryByUserId(Integer userId);
}
