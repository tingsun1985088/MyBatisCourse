package com.st.mybatis.po;

import java.util.List;

/**
 * @author tingsun
 * @create 2019-09-20 10:47
 */
public class RptQureyVO {

    private RptCustomVO rptCustomVO;

    private List<String> rptNoList;
    //在这里需要包装需要

    public RptCustomVO getRptCustomVO() {
        return rptCustomVO;
    }

    public void setRptCustomVO(RptCustomVO rptCustomVO) {
        this.rptCustomVO = rptCustomVO;
    }

    public List<String> getRptNoList() {
        return rptNoList;
    }

    public void setRptNoList(List<String> rptNoList) {
        this.rptNoList = rptNoList;
    }
}
