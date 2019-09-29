package com.st.mybatis.dao;

import com.st.mybatis.po.ActClmTaskInfoVO;
import com.st.mybatis.po.RptVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Date;

/**
 * @author tingsun
 * @create 2019-09-19 14:44
 */
public class RptDaoImpl implements RptDao {
    private SqlSessionFactory sqlSessionFactory;

    public RptDaoImpl(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public RptVO findRptVOById(String id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptVO rptVO =  sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");
        sqlSession.close();
        return rptVO;
    }

    public void deleteRptVOById(String id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int deleteInt = sqlSession.delete("rpt.deleteRptVOById","8a8581ee4ac731e0014acc708bc1004a");
        sqlSession.commit();
        sqlSession.close();
    }

    public void insertActClmTaskInfo(ActClmTaskInfoVO actClmTaskInfoVO) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        int insertInt = sqlSession.insert("rpt.insertActClmTaskInfo",actClmTaskInfoVO);
        sqlSession.commit();
        sqlSession.close();
    }
}
