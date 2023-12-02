package cn.mf5;

import cn.mf5.dao.UserDao;
import cn.mf5.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/*
* springboot项目测试类
*   1、测试类必须在测试目录下
*   2、测试类必须使用@SpringBootTest注解
*   3、编写普通方法使用@Test注解去测试
*/
@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test01(){
        List<User> all = userDao.findAll();
        System.out.println("用户对象：" + all);
    }
}
