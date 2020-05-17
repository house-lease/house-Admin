package cn.bdqn.service;

import cn.bdqn.domain.Particular;

import java.util.List;

public interface ParticularService {



    //根据id查询
    List<Particular> queryByPrimaryKey(Integer id);
   //根据id和phone查询
    List<Particular> queryByIdAndPhone(String phone,Integer id);

    //    根据id删除
    void updateById(Integer id);

    //    根据phone查询
    public List<Particular> queryByUserId(String phone,int page,int size);
}
