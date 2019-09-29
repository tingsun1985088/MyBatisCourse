package com.st.mybatis.po;

import java.util.Date;

/**
 * RptVO entity. @author MyEclipse Persistence Tools
 */

public class RptVO  implements java.io.Serializable {
	// Fields
	private String C_ID;
	private String C_ADT_NO;
	private String C_RPT_NO;
	private String C_RPT_ID;
	private String C_DRV_NME;

	@Override
	public String toString() {
		return "RptVO{" +
				"C_ID='" + C_ID + '\'' +
				", C_ADT_NO='" + C_ADT_NO + '\'' +
				", C_RPT_NO='" + C_RPT_NO + '\'' +
				", C_RPT_ID='" + C_RPT_ID + '\'' +
				", C_DRV_NME='" + C_DRV_NME + '\'' +
				'}';
	}

	public String getC_ID() {
		return C_ID;
	}

	public String getC_ADT_NO() {
		return C_ADT_NO;
	}

	public String getC_RPT_NO() {
		return C_RPT_NO;
	}

	public String getC_RPT_ID() {
		return C_RPT_ID;
	}

	public void setC_ID(String c_ID) {
		C_ID = c_ID;
	}

	public void setC_ADT_NO(String c_ADT_NO) {
		C_ADT_NO = c_ADT_NO;
	}

	public void setC_RPT_NO(String c_RPT_NO) {
		C_RPT_NO = c_RPT_NO;
	}

	public void setC_RPT_ID(String c_RPT_ID) {
		C_RPT_ID = c_RPT_ID;
	}

	public String getC_DRV_NME() {
		return C_DRV_NME;
	}

	public void setC_DRV_NME(String c_DRV_NME) {
		C_DRV_NME = c_DRV_NME;
	}
}