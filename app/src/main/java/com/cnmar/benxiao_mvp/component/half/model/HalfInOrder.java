package com.cnmar.benxiao_mvp.component.half.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

import component.common.model.BaseModel;
import component.half.vo.InOrderStatusVo;
import component.produce.model.ProduceBomBatch;

/** 半成品入库单 */
public class HalfInOrder extends BaseModel {

	@JSONField(ordinal = 1)
	private String code; // 入库单号
	@JSONField(ordinal = 2, format = "yyyyMMddHHmmss")
	private Date inTime; // 入库时间
	@JSONField(ordinal = 5)
	private String remark; // 备注
	@JSONField(ordinal = 6)
	private int status; // 入库单状态 - 1待打印2待入库3已入库4部分入库

	@JSONField(ordinal = 7)
	private ProduceBomBatch batch;
	@JSONField(ordinal = 8)
	private List<HalfInOrderHalf> inOrderHalfs;
	@JSONField(ordinal = 9)
	private List<HalfInOrderSpace> inOrderSpaces;
	@JSONField(ordinal = 10)
	private HalfSpace space;
	@JSONField(serialize = false)
	private boolean showPrint;

	public HalfInOrder() {

	}

	public HalfInOrder(String code, int status, int cid, Date ctime) {
		this.code = code;
		this.status = status;
		this.cid = cid;
		this.ctime = ctime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public ProduceBomBatch getBatch() {
		return batch;
	}

	public void setBatch(ProduceBomBatch batch) {
		this.batch = batch;
	}

	public List<HalfInOrderHalf> getInOrderHalfs() {
		return inOrderHalfs;
	}

	public void setInOrderHalfs(List<HalfInOrderHalf> inOrderHalfs) {
		this.inOrderHalfs = inOrderHalfs;
	}

	public List<HalfInOrderSpace> getInOrderSpaces() {
		return inOrderSpaces;
	}

	public void setInOrderSpaces(List<HalfInOrderSpace> inOrderSpaces) {
		this.inOrderSpaces = inOrderSpaces;
	}

	public HalfSpace getSpace() {
		return space;
	}

	public void setSpace(HalfSpace space) {
		this.space = space;
	}

	public boolean isShowPrint() {
		return showPrint;
	}

	public void setShowPrint(boolean showPrint) {
		this.showPrint = showPrint;
	}

	@JSONField(serialize = false)
	public InOrderStatusVo getInOrderStatusVo() {
		return InOrderStatusVo.getInstance(status);
	}

}
