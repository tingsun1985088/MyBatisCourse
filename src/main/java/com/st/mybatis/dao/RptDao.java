package com.st.mybatis.dao;

import com.st.mybatis.po.ActClmTaskInfoVO;
import com.st.mybatis.po.RptVO;

import java.util.concurrent.Executors;

/**
 * @author tingsun
 * @create 2019-09-19 14:41
 */
public interface RptDao {
    public RptVO findRptVOById(String id) throws Exception;

    public void deleteRptVOById(String id)throws Exception;

    public void insertActClmTaskInfo(ActClmTaskInfoVO actClmTaskInfoVO) throws Exception;
}
