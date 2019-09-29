package com.st.mybatis.po;

import java.util.Date;

/**
 * @author tingsun
 * @create 2019-09-23 8:31
 */
public class OrderCustom extends Orders {

    private String username;// 用户姓名
    private String sex;// 性别
    private String address;// 地址

    @Override
    public String toString() {
        return "OrderCustom{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
