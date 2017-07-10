package com.cnmar.benxiao_mvp.component.material.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/** 入库单原料仓位关系 */
public class MaterialInOrderSpace {

	@JSONField(ordinal = 1)
	private int id;
	@JSONField(ordinal = 2)
	private int inOrderId; // 入库单id
	@JSONField(ordinal = 3)
	private int materialId; // 原料id
	@JSONField(ordinal = 4)
	private int spaceId; // 仓位id
	@JSONField(ordinal = 6)
	private int inStock; // 已入库数量
	@JSONField(ordinal = 7)
	private String qrcode; // 二维码相对路径

	@JSONField(ordinal = 8)
	private Material material;
	@JSONField(ordinal = 9)
	private MaterialSpace space;
	@JSONField(ordinal = 10)
	private int preInStock; // 待入库总量

	@JSONField(ordinal = 11)
	private MaterialInOrder inOrder;
	@JSONField(ordinal = 12)
	private List<MaterialOutOrder> outOrders;
	@JSONField(ordinal = 13)
	private boolean saveInput; // 保存输入数量入库

	public MaterialInOrderSpace() {

	}

	public MaterialInOrderSpace(int inOrderId, int materialId) {
		this.inOrderId = inOrderId;
		this.materialId = materialId;
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

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public int getSpaceId() {
		return spaceId;
	}

	public void setSpaceId(int spaceId) {
		this.spaceId = spaceId;
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

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public MaterialSpace getSpace() {
		return space;
	}

	public void setSpace(MaterialSpace space) {
		this.space = space;
	}

	public int getPreInStock() {
		return preInStock;
	}

	public void setPreInStock(int preInStock) {
		this.preInStock = preInStock;
	}

	public MaterialInOrder getInOrder() {
		return inOrder;
	}

	public void setInOrder(MaterialInOrder inOrder) {
		this.inOrder = inOrder;
	}

	public List<MaterialOutOrder> getOutOrders() {
		return outOrders;
	}

	public void setOutOrders(List<MaterialOutOrder> outOrders) {
		this.outOrders = outOrders;
	}

	public boolean isSaveInput() {
		return saveInput;
	}

	public void setSaveInput(boolean saveInput) {
		this.saveInput = saveInput;
	}

}
