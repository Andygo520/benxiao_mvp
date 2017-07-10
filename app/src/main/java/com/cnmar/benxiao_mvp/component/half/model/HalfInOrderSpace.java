package com.cnmar.benxiao_mvp.component.half.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/** 入库单半成品仓位关系 */
public class HalfInOrderSpace {

	@JSONField(ordinal = 1)
	private int id;
	@JSONField(ordinal = 2)
	private int inOrderId; // 入库单id
	@JSONField(ordinal = 3)
	private int halfId; // 半成品id
	@JSONField(ordinal = 4)
	private int spaceId; // 仓位id
	@JSONField(ordinal = 6)
	private int inStock; // 已入库数量
	@JSONField(ordinal = 7)
	private String qrcode; // 二维码相对路径

	@JSONField(ordinal = 8)
	private Half half;
	@JSONField(ordinal = 9)
	private HalfSpace space;
	@JSONField(ordinal = 10)
	private int preInStock; // 待入库总量

	@JSONField(ordinal = 11)
	private HalfInOrder inOrder;
	@JSONField(ordinal = 12)
	private List<HalfOutOrder> outOrders;

	public HalfInOrderSpace() {

	}

	public HalfInOrderSpace(int inOrderId, int halfId) {
		this.inOrderId = inOrderId;
		this.halfId = halfId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInOrderId() {
		return inOrderId;
	}

	public void setInOrderId(int inOrderId) {
		this.inOrderId = inOrderId;
	}

	public int getHalfId() {
		return halfId;
	}

	public void setHalfId(int halfId) {
		this.halfId = halfId;
	}

	public int getSpaceId() {
		return spaceId;
	}

	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
	}

	public Integer getPreInStock() {
		return preInStock;
	}

	public void setPreInStock(Integer preInStock) {
		this.preInStock = preInStock;
	}

	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

	public Half getHalf() {
		return half;
	}

	public void setHalf(Half half) {
		this.half = half;
	}

	public HalfSpace getSpace() {
		return space;
	}

	public void setSpace(HalfSpace space) {
		this.space = space;
	}

	public HalfInOrder getInOrder() {
		return inOrder;
	}

	public void setInOrder(HalfInOrder inOrder) {
		this.inOrder = inOrder;
	}

	public List<HalfOutOrder> getOutOrders() {
		return outOrders;
	}

	public void setOutOrders(List<HalfOutOrder> outOrders) {
		this.outOrders = outOrders;
	}

	public void setPreInStock(int preInStock) {
		this.preInStock = preInStock;
	}

}
