package com.st.mybatis.dao;

import com.st.mybatis.po.RptVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author tingsun
 * @create 2019-09-19 16:03
 */
public class UserDaoImplTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {
        RptDao rptDao = new RptDaoImpl(sqlSessionFactory);

        RptVO rptVO = rptDao.findRptVOById("8a8581ee4ac731e0014acc708bc1004a");

        System.out.println(rptVO);

    }
}
