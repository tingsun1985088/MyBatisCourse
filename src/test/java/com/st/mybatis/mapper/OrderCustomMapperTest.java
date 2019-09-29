package com.st.mybatis.mapper;

import com.st.mybatis.po.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-19 16:03
 */
public class OrderCustomMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testFindOrderCustomList() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderCustomMapper orderCustomMapper =  sqlSession.getMapper(OrderCustomMapper.class);
        List<OrderCustom> orderCustomList = orderCustomMapper.findOrderCustomList("u1");
        if (orderCustomList!=null&&!orderCustomList.isEmpty()){
            for (OrderCustom orderCustom:orderCustomList){
                System.out.println(orderCustom);
            }
        }
        System.out.println(orderCustomMapper);
    }
    @Test
    public void testFindOrderCustomListResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderCustomMapper orderCustomMapper =  sqlSession.getMapper(OrderCustomMapper.class);
        List<Orders> orderList = orderCustomMapper.findOrderCustomListResultMap("u1");
        if (orderList!=null&&!orderList.isEmpty()){
            for (Orders orders:orderList){
                System.out.println(orders);
            }
        }
        System.out.println(orderCustomMapper);
    }
    @Test
    public void testFindOrdersAndOrderDetailResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderCustomMapper orderCustomMapper =  sqlSession.getMapper(OrderCustomMapper.class);
        List<Orders> orderList = orderCustomMapper.findOrdersAndOrderDetailResultMap("u1");
        if (orderList!=null&&!orderList.isEmpty()){
            for (Orders orders:orderList){
                System.out.println(orders);
            }
        }
        System.out.println(orderCustomMapper);
    }
    @Test
    public void testFindUserAndItemsResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderCustomMapper orderCustomMapper =  sqlSession.getMapper(OrderCustomMapper.class);
        List<User> usersList = orderCustomMapper.findUserAndItemsResultMap("u1");
        if (usersList!=null&&!usersList.isEmpty()){
            for (User user:usersList){
                System.out.println(user);
            }
        }
        System.out.println(orderCustomMapper);
    }
    @Test
    public void testFindOrdersUserLazyLoading() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderCustomMapper orderCustomMapper =  sqlSession.getMapper(OrderCustomMapper.class);
        List<Orders> orderList = orderCustomMapper.findOrdersUserLazyLoading("u1");
        if (orderList!=null&&!orderList.isEmpty()){
            for (Orders orders:orderList){
                User user = orders.getUser();
                System.out.println(orders);
                System.out.println(user);
            }
        }
        System.out.println(orderCustomMapper);
    }
}
