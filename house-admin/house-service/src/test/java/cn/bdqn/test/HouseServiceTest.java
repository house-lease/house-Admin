package cn.bdqn.test;

import cn.bdqn.domain.HouseCareful;
import cn.bdqn.service.HouseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HouseServiceTest {

    @Test
    public void testModifyByHouseId() throws Exception{
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-mapper.xml", "beans-service.xml");
        HouseService houseService = (HouseService) applicationContext.getBean("houseService");
        HouseCareful houseCareful = new HouseCareful();
        houseCareful.setHouseId(1);
        houseCareful.setFurniture("72寸黑白小电视");
        houseService.modifyByHouseId(houseCareful);
    }
}
