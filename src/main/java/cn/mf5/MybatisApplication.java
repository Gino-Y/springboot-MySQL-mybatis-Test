package cn.mf5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 使用mybatis的时候，不需要在每个dao接口上加@Mapper注解
// 可以在启动类上加@MapperScan注解
@MapperScan(basePackages = "cn.mf5.dao")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
