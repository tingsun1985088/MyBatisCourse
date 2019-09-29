package com.st.mybatis.mapper;

import com.st.mybatis.po.*;

import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-19 14:41
 */
public interface OrderCustomMapper {
    //1、在mapper.xml中namespace等于mapper接口地址
    //2、mapper.java接口中的方法名和mapper.xml中statement的id一致
    //3、mapper.java接口中的方法输入参数类型和mapper.xml中statement的parameterType指定的类型一致。
    //4、mapper.java接口中的方法返回值类型和mapper.xml中statement的resultType指定的类型一致。
    //总结：以上开发规范主要是对下边的代码进行统一生成
    public List<OrderCustom> findOrderCustomList(String userid)throws Exception;
    public List<Orders> findOrderCustomListResultMap(String userid)throws Exception;
    public List<Orders> findOrdersAndOrderDetailResultMap(String userid)throws Exception;
    public List<User> findUserAndItemsResultMap(String userid)throws Exception;
    public List<Orders> findOrdersUserLazyLoading(String userid)throws Exception;
}
