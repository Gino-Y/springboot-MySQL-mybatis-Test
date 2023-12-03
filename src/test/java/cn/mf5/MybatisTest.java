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
    // 查
    //   查询所有
    @Test
    public void testFindAll(){
        List<User> all = userDao.findAll();
        System.out.println("用户对象：" + all);
    }
    //   根据id查询
    @Test
    public void testFindByID(){
        User user = userDao.findById(26);
        User user2 = userDao.findById(24);
        System.out.println("用户对象：" + user);
        System.out.println("用户对象：" + user2);
    }
    //   多条件查询
    @Test
    public void testFindByCondition(){
        List<User> users = userDao.findByCondition("张", 18, 0, "123456789");
        System.out.println("用户对象：" + users);
    }
    // 删
    @Test
    public void testDeletById(){
        int row = userDao.deleteById(29);
        System.out.println("删除结果：" + row);
    }
    // 增
    @Test
    public void testInsert(){
        User user = new User();
//        user.setId(31);
        user.setName("张三");
        user.setAge(18);
        user.setGender(0);
        user.setPhone("123456789");
        int row = userDao.insert(user);
        System.out.println("插入结果：" + row);
        System.out.println("新增成功吗：" + (row > 0));
        System.out.println(("新增角色ID是：" + user.getId()));
    }
    // 改
    @Test
    void testUpdate() {
        User user = new User();
        user.setId(25);
        user.setName("李四");
        user.setAge(30);
        user.setGender(1);
        user.setPhone("1234567890");

        int row = userDao.update(user);
        System.out.println("更新结果：" + row);
    }
}
