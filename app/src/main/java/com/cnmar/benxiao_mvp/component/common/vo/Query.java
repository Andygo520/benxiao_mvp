package com.cnmar.benxiao_mvp.component.common.vo;

import org.apache.commons.lang.StringUtils;

import java.util.Date;

public class Query implements Cloneable {

	private String username;
	private String name;
	private String code;
	private String card;

	private int pid;

	private Boolean isEnable;

	private Integer type;
	private Integer stockType;
	private Integer packType;

	private Integer categoryId;
	private Integer deptId;
	private Integer userId;

	private Integer status;
	private Integer auditStatus;

	private Date sdate;
	private Date edate;

	public static final Query getInstance(Query query) throws Exception {
		Query clone = (Query) query.clone();
		if (StringUtils.isNotEmpty(clone.getUsername())) {
			clone.setUsername("%" + clone.getUsername().trim() + "%");
		}
		if (StringUtils.isNotEmpty(clone.getName())) {
			clone.setName("%" + clone.getName().trim() + "%");
		}
		if (StringUtils.isNotEmpty(clone.getCode())) {
			clone.setCode("%" + clone.getCode().trim() + "%");
		}
		if (StringUtils.isNotEmpty(clone.getCard())) {
			clone.setCard("%" + clone.getCard().trim() + "%");
		}
		return clone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Boolean getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getStockType() {
		return stockType;
	}

	public void setStockType(Integer stockType) {
		this.stockType = stockType;
	}

	public Integer getPackType() {
		return packType;
	}

	public void setPackType(Integer packType) {
		this.packType = packType;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

}
