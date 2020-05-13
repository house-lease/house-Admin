package cn.bdqn.mapper;

import cn.bdqn.domain.Address;

import java.util.List;

public interface AddressMapper {

    void deleteByPrimaryKey(Integer id);

    void insert(Address record);

    void insertSelective(Address record);

    List<Address> selectByPrimaryKey(String address);

    Address selectById(Integer id);

    void updateByPrimaryKeySelective(Address record);

    void updateByPrimaryKey(Address record);
}