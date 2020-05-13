package cn.bdqn.service;

import cn.bdqn.domain.House;
import cn.bdqn.domain.HouseCareful;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 房屋业务层
 */
public interface HouseService {

    //查询房屋信息
    public List<House> queryByAddressORLeaseTypeORPriceORStartValue(String address, String houseLeaseName, BigDecimal price, Integer startValue);

    /**
     * 查询房屋【分页】
     * @param houseName
     */
    List<House> selectByPage(String houseName,Integer id, String  userName, Integer page,Integer size);

    /**
     * 根据房屋id查询房屋信息
     * @param id
     * @return
     */
    public House selectByPrimaryKey(Integer id);

    /**
     * 根据房屋对象更新房屋详细信息
     * @param houseCareful
     */
    void modifyById(HouseCareful houseCareful);

    /*
     * 根据房东查询房屋
     * @param username
     * @return
     */
    House selectByUserName(String username);

    /**
     * 根据房屋id查询房屋详细信息
     */
    HouseCareful selectHouseCarefulByHouseId(Integer houseId);
}
