package cn.bdqn.test;

import cn.bdqn.domain.User;
import cn.bdqn.service.ParticularService;
import cn.bdqn.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 *      用户测试
 * */
public class UserServiceTest {

    //查询全部
    @Test
    public void testSelectAll() throws Exception {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("beans-service.xml","beans-mapper.xml");

        UserService userService = (UserService) ac.getBean("userService");

        PageHelper.startPage(1,10);//设置分页 每页10条数据
        //查询全部数据【模糊查询】
        List<User> users = userService.queryByUser("",1,1);

        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        users = userPageInfo.getList();

        for (User users1: users){
            System.out.println("用户名称："+users1.getUserName());
            System.out.println(users1.getState());
        }

        System.out.println("总条数："+userPageInfo.getSize());
        System.out.println("总页数："+userPageInfo.getPages());
    }


    /**
     *  修改用户状态
     */
    @Test
    public void testUpdateByState() throws Exception {

        ApplicationContext ac =  new ClassPathXmlApplicationContext("beans-service.xml","beans-mapper.xml");

        UserService userService = (UserService) ac.getBean("userService");

        User user = new User();
        user.setId(1);
        user.setState(1);

//        Integer integer = userService.updateByState(user);
//        if (integer == 1){
//           System.out.println("修改成功!");
//        }

    }

}
