package com.st.mybatis.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-20 15:26
 */
public class User implements Serializable {

    //属性名和数据库表的字段对应
    private String id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    //用户创建的订单列表
    private List<Orders> ordersList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", sex=" + sex
                + ", birthday=" + birthday + ", address=" + address + "]";
    }
    public List<Orders> getOrdersList() {
        return ordersList;
    }
    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

}

