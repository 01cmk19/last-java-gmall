package com.galaxy.user.manage.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Data//生成get set方法
//实现序列化接口的目的时使用dubbo远程传输
public class UserInfo implements Serializable {
    @Id//表示当前属性是主键关联
    @Column//与id列关联

    @GeneratedValue(strategy = GenerationType.IDENTITY)//1.自增（数据库的自增）2.插入后自动自增返回主键(相当于之前的查询主键)
    //1.AUTO代码自增 bug两个人同时访问会出现重复id
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
