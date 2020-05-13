package cn.bdqn.mapper;

import cn.bdqn.domain.HouseCareful;

import java.util.List;

/**
 * 房屋详细信息接口
 */
public interface HouseCarefulMapper {



    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入
     *
     * @param record
     * @return
     */
    int insert(HouseCareful record);

    /**
     * @param record
     * @return
     */
    int insertSelective(HouseCareful record);

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    HouseCareful selectByPrimaryKey(Integer id);

    /**
     * 选择更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(HouseCareful record);

    /**
     * 根据id更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(HouseCareful record);

    /**
     * 根据房屋对象更新房屋详细信息
     * @param houseCareful
     */
    void updateById(HouseCareful houseCareful);
    /*
     * 根据房屋id查询
     * @param houseId
     * @return
     */
    public List<HouseCareful> selectByHouseId(Integer houseId);

}