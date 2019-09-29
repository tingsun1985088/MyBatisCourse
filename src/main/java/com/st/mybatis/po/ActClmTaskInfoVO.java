package com.st.mybatis.po;

import java.util.Date;

/**
 * @author tingsun
 * @create 2019-09-19 11:11
 */
public class ActClmTaskInfoVO {
    private String C_ID;
    private String C_TASK_ID;
    private Date T_CRT_TM;
    private String C_CRT_CDE;
    private Date T_UPT_TM;
    private String C_UPT_CDE;
    private String C_RPT_NO;
    private String C_TASK_TYPE;
    private String C_OWNER_ID;
    private String C_BELONG_DPT_CDE;
    private String C_OPER_TYPE;

    @Override
    public String toString() {
        return "ActClmTaskInfoVO{" +
                "C_ID='" + C_ID + '\'' +
                ", C_TASK_ID='" + C_TASK_ID + '\'' +
                ", T_CRT_TM=" + T_CRT_TM +
                ", C_CRT_CDE='" + C_CRT_CDE + '\'' +
                ", T_UPT_TM=" + T_UPT_TM +
                ", C_UPT_CDE='" + C_UPT_CDE + '\'' +
                ", C_RPT_NO='" + C_RPT_NO + '\'' +
                ", C_TASK_TYPE='" + C_TASK_TYPE + '\'' +
                ", C_OWNER_ID='" + C_OWNER_ID + '\'' +
                ", C_BELONG_DPT_CDE='" + C_BELONG_DPT_CDE + '\'' +
                ", C_OPER_TYPE='" + C_OPER_TYPE + '\'' +
                '}';
    }

    public String getC_ID() {
        return C_ID;
    }

    public void setC_ID(String c_ID) {
        C_ID = c_ID;
    }

    public String getC_TASK_ID() {
        return C_TASK_ID;
    }

    public void setC_TASK_ID(String c_TASK_ID) {
        C_TASK_ID = c_TASK_ID;
    }

    public Date getT_CRT_TM() {
        return T_CRT_TM;
    }

    public void setT_CRT_TM(Date t_CRT_TM) {
        T_CRT_TM = t_CRT_TM;
    }

    public String getC_CRT_CDE() {
        return C_CRT_CDE;
    }

    public void setC_CRT_CDE(String c_CRT_CDE) {
        C_CRT_CDE = c_CRT_CDE;
    }

    public Date getT_UPT_TM() {
        return T_UPT_TM;
    }

    public void setT_UPT_TM(Date t_UPT_TM) {
        T_UPT_TM = t_UPT_TM;
    }

    public String getC_UPT_CDE() {
        return C_UPT_CDE;
    }

    public void setC_UPT_CDE(String c_UPT_CDE) {
        C_UPT_CDE = c_UPT_CDE;
    }

    public String getC_RPT_NO() {
        return C_RPT_NO;
    }

    public void setC_RPT_NO(String c_RPT_NO) {
        C_RPT_NO = c_RPT_NO;
    }

    public String getC_TASK_TYPE() {
        return C_TASK_TYPE;
    }

    public void setC_TASK_TYPE(String c_TASK_TYPE) {
        C_TASK_TYPE = c_TASK_TYPE;
    }

    public String getC_OWNER_ID() {
        return C_OWNER_ID;
    }

    public void setC_OWNER_ID(String c_OWNER_ID) {
        C_OWNER_ID = c_OWNER_ID;
    }

    public String getC_BELONG_DPT_CDE() {
        return C_BELONG_DPT_CDE;
    }

    public void setC_BELONG_DPT_CDE(String c_BELONG_DPT_CDE) {
        C_BELONG_DPT_CDE = c_BELONG_DPT_CDE;
    }

    public String getC_OPER_TYPE() {
        return C_OPER_TYPE;
    }

    public void setC_OPER_TYPE(String c_OPER_TYPE) {
        C_OPER_TYPE = c_OPER_TYPE;
    }
}
