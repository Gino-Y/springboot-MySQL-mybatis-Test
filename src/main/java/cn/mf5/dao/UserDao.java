package cn.mf5.dao;

import cn.mf5.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    public List<User> findAll();
}
