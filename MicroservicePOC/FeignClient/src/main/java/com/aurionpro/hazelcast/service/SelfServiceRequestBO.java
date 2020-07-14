package com.aurionpro.hazelcast.service;

import java.io.Serializable;
import java.util.Date;

public class SelfServiceRequestBO  implements Serializable{
	
	  	/**
	 * 
	 */
	private static final long serialVersionUID = -6259339641434684560L;
	private Long id;
	private Long corporateid;
	private Long corporategroupid;
	private String corporatecode;
	private String corporatename;
	private SelfServiceProductType selfserviceproduct;
	private SelfServiceRequestType requesttype;
	private String referenceno;
	private Date entrydate;
	private Date bankupdated;
	private Long accountid;
	private String accountno;
	private String accounttitle;
	private String batchstatus;
	private String status;
	private String remarks;
	private String bankremarks;
	private String changeinfo;
	private String requestby;
	private String selfserviceproductname;
	private String requesttypename;


	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCorporateid() {
		return corporateid;
	}

	public void setCorporateid(Long corporateid) {
		this.corporateid = corporateid;
	}

	public Long getCorporategroupid() {
		return corporategroupid;
	}

	public void setCorporategroupid(Long corporategroupid) {
		this.corporategroupid = corporategroupid;
	}

	public String getCorporatecode() {
		return corporatecode;
	}

	public void setCorporatecode(String corporatecode) {
		this.corporatecode = corporatecode;
	}

	public String getCorporatename() {
		return corporatename;
	}

	public void setCorporatename(String corporatename) {
		this.corporatename = corporatename;
	}

	public SelfServiceProductType getSelfserviceproduct() {
		return selfserviceproduct;
	}

	public void setSelfserviceproduct(SelfServiceProductType selfserviceproduct) {
		this.selfserviceproduct = selfserviceproduct;
	}

	public SelfServiceRequestType getRequesttype() {
		return requesttype;
	}

	public void setRequesttype(SelfServiceRequestType requesttype) {
		this.requesttype = requesttype;
	}

	public String getReferenceno() {
		return referenceno;
	}

	public void setReferenceno(String referenceno) {
		this.referenceno = referenceno;
	}

	public Date getEntrydate() {
		return entrydate;
	}

	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}

	public Date getBankupdated() {
		return bankupdated;
	}

	public void setBankupdated(Date bankupdated) {
		this.bankupdated = bankupdated;
	}

	public Long getAccountid() {
		return accountid;
	}

	public void setAccountid(Long accountid) {
		this.accountid = accountid;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getAccounttitle() {
		return accounttitle;
	}

	public void setAccounttitle(String accounttitle) {
		this.accounttitle = accounttitle;
	}

	public String getBatchstatus() {
		return batchstatus;
	}

	public void setBatchstatus(String batchstatus) {
		this.batchstatus = batchstatus;
	}

	public String getBankremarks() {
		return bankremarks;
	}

	public void setBankremarks(String bankremarks) {
		this.bankremarks = bankremarks;
	}

	public String getChangeinfo() {
		return changeinfo;
	}

	public void setChangeinfo(String changeinfo) {
		this.changeinfo = changeinfo;
	}

	public String getRequestby() {
		return requestby;
	}

	public void setRequestby(String requestby) {
		this.requestby = requestby;
	}

	public String getSelfserviceproductname() {
		return selfserviceproductname;
	}

	public void setSelfserviceproductname(String selfserviceproductname) {
		this.selfserviceproductname = selfserviceproductname;
	}

	public String getRequesttypename() {
		return requesttypename;
	}

	public void setRequesttypename(String requesttypename) {
		this.requesttypename = requesttypename;
	}

}
