package com.st.mybatis.first;

import com.st.mybatis.po.ActClmTaskInfoVO;
import com.st.mybatis.po.RptVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-18 16:45
 */

public class HelloMyBatis {
    // 根据id查询用户信息，得到一条记录结果
    @Test
    public void findRptVOByIdTest() throws IOException {
        // mybatis配置文件
        String resource = "SqlMapConfig.xml";
        // 得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建会话工厂，传入mybatis的配置文件信息
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        // 通过工厂得到SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 通过SqlSession操作数据库
        // 第一个参数：映射文件中statement的id，等于=namespace+"."+statement的id
        // 第二个参数：指定和映射文件中所匹配的parameterType类型的参数
        // sqlSession.selectOne结果 是与映射文件中所匹配的resultType类型的对象
        // selectOne查询出一条记录
        RptVO rptVO = sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");

        System.out.println(rptVO);

        // 释放资源
        sqlSession.close();
    }

    @Test
    public  void findRptVOByRptNo() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<RptVO> rptVOList = sqlSession.selectList("rpt.findRptVOByRptNo","4100101000103300120150300002");

        if (rptVOList!=null&&!rptVOList.isEmpty()){
            for (RptVO rptVO:rptVOList){
                System.out.println(rptVO);
            }
        }
        sqlSession.close();
    }
    @Test
    public void deleteRptVOById() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //(1)删除前查询
        RptVO rptVO = sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");
        System.out.println(rptVO);
        //(2)删除
        int deleteInt = sqlSession.delete("rpt.deleteRptVOById","8a8581ee4ac731e0014acc708bc1004a");
        System.out.println(deleteInt);
        //(3)删除后查询
        rptVO = sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");
        System.out.println(rptVO);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateRptVOById() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //(1)修改前查询
        RptVO rptVO = sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");
        System.out.println(rptVO);
        //(2)修改
        rptVO.setC_DRV_NME("张三");
        int updateInt = sqlSession.update("rpt.updateRptVOById",rptVO);
        System.out.println(updateInt);
        //(3)修改后查询
        rptVO = sqlSession.selectOne("rpt.findRptVOById", "8a8581ee4ac731e0014acc708bc1004a");
        System.out.println(rptVO);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void insertActClmTaskInfo()throws IOException{
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

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
        int insertInt = sqlSession.insert("rpt.insertActClmTaskInfo",actClmTaskInfoVO);
        System.out.println(insertInt);

        sqlSession.commit();
        sqlSession.close();
    }
}
