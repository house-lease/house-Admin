package cn.bdqn.service;

import cn.bdqn.domain.Address;

import java.util.List;

/**
 *  城市业务层
 *
 */
public interface AddressService {

    //查询出所有城市名
    List<Address> selectAddress();

    //关联自身查询
    Address selectByPrimaryKey(Integer id);

    //添加城市
    void insertAddress(Address address);

    //查询
    List<Address> queryAll(String address,int page,int size);

    //根据id查询
    Address selectById(Integer id);

    //修改
    void updateById(Address address);

    int selectByAddress(String address);

    //删除
    void deleteById(Integer id);
}
