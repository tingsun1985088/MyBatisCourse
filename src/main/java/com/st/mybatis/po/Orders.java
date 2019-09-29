package com.st.mybatis.po;

import java.util.Date;
import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-20 15:26
 */
public class Orders {
    private Integer id;

    private String userid;

    private String numbers;

    private Date createtime;

    private String note;

    //用户信息
    private User user;

    //订单明细
    private List<Orderdetail> orderdetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", numbers='" + numbers + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", user=" + user +
                ", orderdetails=" + orderdetails +
                '}';
    }
}
