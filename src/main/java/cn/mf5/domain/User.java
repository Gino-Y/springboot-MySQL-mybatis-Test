package cn.mf5.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 生成get set方法 toString方法
@NoArgsConstructor // 生成无参构造方法
@AllArgsConstructor // 生成有参构造方法
public class User {
    private int id;
    private String name;
    private int age;
    private int gender;
    private String phone;
}