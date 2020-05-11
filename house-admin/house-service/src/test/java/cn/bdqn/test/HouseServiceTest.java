package cn.bdqn.test;

import cn.bdqn.domain.HouseCareful;
import cn.bdqn.service.HouseService;
import cn.bdqn.domain.House;
import cn.bdqn.service.AddressService;
import cn.bdqn.service.HouseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class HouseServiceTest {
    /*
     *  房屋测试
     */
    //测试查询房屋【分页】
    @Test
    public void testSelectByPage() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        HouseService houseService = (HouseService) ac.getBean("houseService");

        PageHelper.startPage(1, 10);//设置分页 每页10条数据
        //查询全部数据【支持模糊查询】
        List<House> houses = houseService.selectByPage("");

        PageInfo<House> housePageInfo = new PageInfo<House>(houses);
        houses = housePageInfo.getList();

        for (House house : houses) {
            System.out.println("房屋名称：" + house.getHouseName());
        }
        System.out.println("总条数：" + housePageInfo.getSize());
        System.out.println("总页数：" + housePageInfo.getPages());
    }

    /**
     * 根据房东查询房屋
     *
     * @throws Exception
     */
    @Test
    public void testByUsername() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        HouseService houseService = (HouseService) ac.getBean("houseService");

        House house = houseService.selectByUserName("张三");
        System.out.println(house.getHouseName());
    }

    /**
     * 根据id更新房屋信息
     * @throws Exception
     */
    @Test
    public void testModifyById() throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        HouseService service = (HouseService) applicationContext.getBean("houseService");
        HouseCareful houseCareful = new HouseCareful();
        houseCareful.setHouseId(1);
        houseCareful.setBingxiang(0);
        houseCareful.setChuang(0);
        houseCareful.setId(1);
        service.modifyById(houseCareful);
    }
}
