package cn.mf5.dao;

import cn.mf5.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    // 查
    //   查询所有
    @Select("select * from user")
    public List<User> findAll();
    //   根据id查询
    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
    //   多条件查询
    @Select("select * from user where name like concat('%', #{name}, '%') and age = #{age} and gender = #{gender} and phone = #{phone}")
    public List<User> findByCondition(String name, int age, int gender, String phone);
    // 删
    @Delete("delete from user where id = #{id}")
    public int deleteById(Integer id);
    // 增
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    @Insert("INSERT INTO user (id, name, age, gender, phone) " +
            "VALUES (#{id}, #{name}, #{age}, #{gender}, #{phone})")
    public int insert(User user);
    // 改
    @Update("UPDATE User SET name = #{name}, age = #{age}, gender = #{gender}, phone = #{phone} WHERE id = #{id}")
    public int update(User user);

}
