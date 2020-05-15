package cn.bdqn.test;

import cn.bdqn.domain.Address;
import cn.bdqn.service.AddressService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 *  城市测试
 */
public class AddressServiceTest {


//    //查询
//    @Test
//    public void testSelectAll() throws Exception {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");
//
//        AddressService addressService = (AddressService) ac.getBean("addressService");
//
//        List<Address> addressList =addressService.queryAll("");
//
//        for(Address address : addressList){
//            System.out.println("城市名称："+address.getAddress());
//            System.out.println(address.getParentId());
//        }
//    }

    //添加城市
    @Test
    public void testInsert() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        AddressService addressService = (AddressService) ac.getBean("addressService");

        Address address = new Address();
        address.setAddress("二七区");
        address.setParentId(1);
        address.setState(0);

        addressService.insertAddress(address);
    }

    //添加城市
    @Test
    public void testUpdate() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        AddressService addressService = (AddressService) ac.getBean("addressService");

        Address address = new Address();
        address.setAddress("中原区");
        address.setParentId(1);
        address.setState(0);

        addressService.updateById(address);
    }

    //查询
    @Test
    public void testSelectAddress() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-service.xml", "beans-mapper.xml");

        AddressService addressService = (AddressService) ac.getBean("addressService");

        Address address = addressService.selectByAddress("郑州市");
        System.out.println(address);
    }


}
