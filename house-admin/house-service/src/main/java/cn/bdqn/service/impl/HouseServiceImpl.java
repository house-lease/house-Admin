package cn.bdqn.service.impl;

import cn.bdqn.domain.House;
import cn.bdqn.domain.HouseCareful;
import cn.bdqn.domain.HouseImage;
import cn.bdqn.mapper.HouseCarefulMapper;
import cn.bdqn.mapper.HouseImageMapper;
import cn.bdqn.mapper.HouseMapper;
import cn.bdqn.service.HouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service("houseService")
public class HouseServiceImpl implements HouseService {

    //注入房屋接口
    @Autowired
    private HouseMapper houseMapper;

    //房屋图片接口
    @Autowired
    private HouseImageMapper houseImageMapper;

    //房屋详细信息接口
    @Autowired
    private HouseCarefulMapper houseCarefulMapper;

    /**
     * 查询房屋信息
     */
    @Override
    public List<House> queryByAddressORLeaseTypeORPriceORStartValue(String address,String houseLeaseName,BigDecimal price,Integer startValue) {
        //查询房屋信息列表
        List<House> houses = houseMapper.selectByAddressORLeaseTypeORPriceORStartValue(address,houseLeaseName,price,startValue);
        //根据房屋id循环查找房屋图片
        for (House house:houses) {
            //调用根据房屋id查询房屋图片的方法
            List<HouseImage> images = houseImageMapper.selectByHouseId(house.getId());
            //添加图片
            house.setHouseImages(images);
        }
        return houses;
    }

    /**
     * 按条件查询房屋【分页】
     * @param houseName
     * @return
     */
    @Override
    public List<House> selectByPage(String houseName,Integer id, String  userName,  Integer page,Integer size ) {
        PageHelper.startPage(page,size);
        return  houseMapper.selectByPage(houseName,id,userName);
    }

    /**
     * 根据房屋id查询
     * @param id
     * @return
     */
    @Override
    public House selectByPrimaryKey(Integer id) {
        //根据id查询房屋信息
        House house = houseMapper.selectByPrimaryKey(id);
        //根据房屋id查询房屋图片信息
        List<HouseImage> houseImages = houseImageMapper.selectByHouseId(id);
        house.setHouseImages(houseImages);
        //返回对象
        return house;
    }
    /**
     * 根据房屋对象更新房屋详细信息
     * @param houseCareful
     */
    @Override
    public void modifyById(HouseCareful houseCareful) {
        houseCarefulMapper.updateById(houseCareful);
    }



    /**
     * 根据房东查询房屋
     * @param username
     * @return
     */
    @Override
    public House selectByUserName(String username) {
        return houseMapper.selectByUserName(username);
    }

    @Override
    public List<HouseCareful> selectByHouseId(Integer houseId) {
        return houseCarefulMapper.selectByHouseId(houseId);
    }
    /**
     * 根据房屋id查询房屋详细信息
     */
    @Override
    public HouseCareful selectHouseCarefulByHouseId(Integer houseId){
        return houseCarefulMapper.selectByPrimaryKey(houseId);
    }
}
