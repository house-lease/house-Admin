package cn.bdqn.service.impl;

import cn.bdqn.domain.Address;
import cn.bdqn.mapper.AddressMapper;
import cn.bdqn.service.AddressService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressService")
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> selectAddress() {
        return addressMapper.selectAddress();
    }

    @Override
    public Address selectByPrimaryKey(Integer id) {
        return addressMapper.selectByPrimaryKey(id);
    }

    //添加
    @Override
    public void insertAddress(Address address) {
        addressMapper.insertSelective(address);
    }

    //查询
    @Override
    public List<Address> queryAll( String address,int page,int size) {
        PageHelper.startPage(page,size);

        return addressMapper.selectByHouseName(address);
    }

    @Override
    public Address selectById(Integer id) {
        return addressMapper.selectById(id);
    }

    //修改
    @Override
    public void updateById(Address address) {
        addressMapper.updateByPrimaryKeySelective(address);
    }

    @Override
    public int selectByAddress(String address) {
        return addressMapper.selectByAddress(address);
    }

    //删除
    @Override
    public void deleteById(Integer id) {
        addressMapper.updateById(id);
    }
}
