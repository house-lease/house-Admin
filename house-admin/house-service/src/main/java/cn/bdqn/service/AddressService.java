package cn.bdqn.service;

import cn.bdqn.domain.Address;

import java.util.List;

/**
 *  城市业务层
 *
 */
public interface AddressService {

    //添加城市
    void insertAddress(Address address);

    //查询全部
    List<Address> queryAll();

    //修改
    void updateById(Address address);

    //删除
    void deleteById(Integer id);
}
