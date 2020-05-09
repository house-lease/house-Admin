package cn.bdqn.service;


import cn.bdqn.domain.Start;

import java.util.List;

public interface StartService {
   //分页查询Start全部信息
    List<Start> queryAll(int page,int size);
   //添加Start
    void save(Start start);
    //根据id删除信息
    void delete(Integer id);
    //根据id查询信息
    Start selectById(Integer id);
    //修改信息
    int  update(Start start);
    //验证是否与数据库数据重复
    int queryCount(String startName,Integer stateValue);
}
