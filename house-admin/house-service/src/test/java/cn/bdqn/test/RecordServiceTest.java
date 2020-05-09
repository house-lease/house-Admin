package cn.bdqn.test;

import cn.bdqn.domain.House;
import cn.bdqn.domain.Record;
import cn.bdqn.domain.User;
import cn.bdqn.service.RecordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordServiceTest {

    @Test
    public void testSave() throws Exception{
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");
        RecordService recordService = (RecordService) applicationContext.getBean("recordServiceImpl");
        Record record = new Record();
        User  payerUser = new User();
        payerUser.setUserName("张三");
        payerUser.setId(1);
        User payeeUser = new User();
        payeeUser.setUserName("李四");
        payeeUser.setId(3);
        record.setPayerUser(payerUser);
        record.setPayeeUser(payeeUser);
        House house = new House();
        house.setId(1);
        house.setHouseName("温馨的家");
        house.setPrice(new BigDecimal(1000));
        house.setStartValue(3);
        record.setHouse(house);
        record.setState(0);
        record.setDealState(1);
        record.setDealMoney(house.getPrice().multiply(new BigDecimal(house.getStartValue())));
        record.setDealTime(new Date());
        record.setRecord("123456tfcccccsedrfgthb");
        recordService.save(record);
    }
    @Test
    public void testQueryRecord() throws Exception{
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");
        RecordService recordService = (RecordService) applicationContext.getBean("recordServiceImpl");
        Map<String, Object> params = new HashMap<>();
        params.put("userId",1 );
//        params.put("record" ,"1223");
        PageHelper.startPage(0, 1);
        PageInfo<Record> recordPageInfo =recordService.queryRecord(params);
        System.out.println(recordPageInfo);
//        System.out.println(records);
    }
}
