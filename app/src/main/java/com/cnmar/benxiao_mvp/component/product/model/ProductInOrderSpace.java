package com.cnmar.benxiao_mvp.component.product.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/** 入库单成品仓位关系 */
public class ProductInOrderSpace {

	@JSONField(ordinal = 1)
	private int id;
	@JSONField(ordinal = 2)
	private int inOrderId; // 入库单id
	@JSONField(ordinal = 3)
	private int productId; // 成品id
	@JSONField(ordinal = 4)
	private int spaceId; // 仓位id
	@JSONField(ordinal = 6)
	private int inStock; // 已入库数量
	@JSONField(ordinal = 7)
	private String qrcode; // 二维码相对路径

	@JSONField(ordinal = 8)
	private Product product;
	@JSONField(ordinal = 9)
	private ProductSpace space;
	@JSONField(ordinal = 10)
	private int preInStock; // 待入库总量

	@JSONField(ordinal = 11)
	private ProductInOrder inOrder;
	@JSONField(ordinal = 12)
	private List<ProductOutOrder> outOrders;

	public ProductInOrderSpace() {

	}

	public ProductInOrderSpace(int inOrderId, int productId) {
		this.inOrderId = inOrderId;
		this.productId = productId;
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

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductSpace getSpace() {
		return space;
	}

	public void setSpace(ProductSpace space) {
		this.space = space;
	}

	public ProductInOrder getInOrder() {
		return inOrder;
	}

	public void setInOrder(ProductInOrder inOrder) {
		this.inOrder = inOrder;
	}

	public List<ProductOutOrder> getOutOrders() {
		return outOrders;
	}

	public void setOutOrders(List<ProductOutOrder> outOrders) {
		this.outOrders = outOrders;
	}

	public void setPreInStock(int preInStock) {
		this.preInStock = preInStock;
	}

}
