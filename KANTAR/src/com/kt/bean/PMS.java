package com.kt.bean;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.hibernate.validator.constraints.NotBlank;

public class PMS {
	//pmsId generated by SEQUENCE 'SEQ_PMSIDGEN' and triggered by TRIG_PMSID in database
	private int jobNumber;
	private String jobPO;
	private String jobName;
	private int progrmId;
	private String clientCntry;
	private int budgetHour;
	private int estimateHour;
	private Date initialDate;
	private Date deliveryDate;
	private String qcRequired;
	private String jobStatus;

	public int getJobNumber() {
		return jobNumber;
	}
	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}
	public String getJobPO() {
		return jobPO;
	}
	public void setJobPO(String jobPO) {
		this.jobPO = jobPO;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getProgrmId() {
		return progrmId;
	}
	public void setProgrmId(int progrmId) {
		this.progrmId = progrmId;
	}
	public String getClientCntry() {
		return clientCntry;
	}
	public void setClientCntry(String clientCntry) {
		this.clientCntry = clientCntry;
	}
	public int getBudgetHour() {
		return budgetHour;
	}
	public void setBudgetHour(int budgetHour) {
		this.budgetHour = budgetHour;
	}
	public int getEstimateHour() {
		return estimateHour;
	}
	public void setEstimateHour(int estimateHour) {
		this.estimateHour = estimateHour;
	}
	
	public String getQcRequired() {
		return qcRequired;
	}
	public void setQcRequired(String qcRequired) {
		this.qcRequired = qcRequired;
	}
	public String getJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}
	public Date getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

}
