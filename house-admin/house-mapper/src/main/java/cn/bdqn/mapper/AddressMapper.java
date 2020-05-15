package cn.bdqn.mapper;

import cn.bdqn.domain.Address;
import cn.bdqn.domain.Start;

import java.util.List;

public interface AddressMapper {




    void insertSelective(Address record);

    Address selectById(Integer id);

    Address selectByAddress(String address);

    void updateByPrimaryKeySelective(Address record);

    void updateByPrimaryKey(Address record);

    //根据id删除信息
    void updateById(Integer id);

    //根据城市名称查询信息
    List<Address>  selectByHouseName(String address);


}