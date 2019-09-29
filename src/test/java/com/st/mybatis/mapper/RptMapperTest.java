package com.st.mybatis.mapper;

import com.st.mybatis.po.ActClmTaskInfoVO;
import com.st.mybatis.po.RptCustomVO;
import com.st.mybatis.po.RptQureyVO;
import com.st.mybatis.po.RptVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-19 16:03
 */
public class RptMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testFindRptVOList() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        RptQureyVO rptQureyVO = new RptQureyVO();
        RptCustomVO rptCustomVO = new RptCustomVO();
        List<String> rptNoList = new ArrayList<String>();
        rptNoList.add("4107300000103301120190000697");
        rptNoList.add("4107300000103000120190000222");
        //rptCustomVO.setC_ID("ff8080816c75afce016c8d8af1cc09a3");
        //rptCustomVO.setC_RPT_NO("4107300000103301120190000697");
        rptQureyVO.setRptCustomVO(rptCustomVO);
        rptQureyVO.setRptNoList(rptNoList);
        List<RptVO> rptVOList = rptMapper.findRptVOList(rptQureyVO);
        if (rptVOList!=null&&!rptVOList.isEmpty()){
            for (RptVO rptVO:rptVOList){
                System.out.println(rptVO);
            }
        }
        System.out.println(rptMapper);
    }
    @Test
    public void testFindUserById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        RptVO rptVO = rptMapper.findRptVOById("8a8581ee4ac731e0014acc708d51004d");
        System.out.println(rptVO);
        System.out.println(rptMapper);
    }
    @Test
    public void testFindRptVOByRptNo() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        List<RptVO> rptVOList = rptMapper.findRptVOByRptNo("4100101000103300120150300002");
        if (rptVOList!=null&&!rptVOList.isEmpty()){
            for (RptVO rptVO:rptVOList){
                System.out.println(rptVO);
            }
        }
        System.out.println(rptMapper);
    }
    @Test
    public void testnsertActClmTaskInfo() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        ActClmTaskInfoVO actClmTaskInfoVO = new ActClmTaskInfoVO();
        //actClmTaskInfoVO.setC_ID("ff8080816afd0b6b016afd2df0c300c1");
        actClmTaskInfoVO.setC_TASK_ID("999999");
        actClmTaskInfoVO.setT_CRT_TM(new Date());
        actClmTaskInfoVO.setC_CRT_CDE("999999");
        actClmTaskInfoVO.setT_UPT_TM(new Date());
        actClmTaskInfoVO.setC_UPT_CDE("999999");
        actClmTaskInfoVO.setC_RPT_NO("999999");
        actClmTaskInfoVO.setC_TASK_TYPE("999999");
        actClmTaskInfoVO.setC_OWNER_ID("999999");
        actClmTaskInfoVO.setC_BELONG_DPT_CDE("999999");
        actClmTaskInfoVO.setC_OPER_TYPE("1");
        rptMapper.insertActClmTaskInfo(actClmTaskInfoVO);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testDeleteRptVOById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        rptMapper.deleteRptVOById("8a8581ee4ac731e0014acc708bc1004a");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateRptVOById() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RptMapper rptMapper =  sqlSession.getMapper(RptMapper.class);
        RptVO rptVO = rptMapper.findRptVOById("8a8581ee4ac731e0014acc708d51004d");
        rptVO.setC_DRV_NME("李四");
        rptMapper.updateRptVOById(rptVO);
        sqlSession.commit();
        sqlSession.close();
    }
}
