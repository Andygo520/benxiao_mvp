package com.cnmar.benxiao_mvp.component.product.model;

import com.alibaba.fastjson.annotation.JSONField;

/** 出库单成品仓位关系 */
public class ProductOutOrderSpace {

	@JSONField(ordinal = 1)
	private int id;
	@JSONField(ordinal = 2)
	private int outOrderId; // 出库单id
	@JSONField(ordinal = 3)
	private int productId; // 成品id
	@JSONField(ordinal = 4)
	private int spaceId; // 仓位id
	@JSONField(ordinal = 5)
	private Integer preOutStock; // 待出库数量
	@JSONField(ordinal = 6)
	private int outStock; // 已出库数量
	@JSONField(ordinal = 7)
	private int inOrderSpaceId; // 入库单成品仓位关系id

	@JSONField(ordinal = 8)
	private Product product;
	@JSONField(ordinal = 9)
	private ProductSpace space;
	@JSONField(ordinal = 10)
	private ProductSpaceStock spaceStock; // 仓位库存

	public ProductOutOrderSpace() {

	}

	public ProductOutOrderSpace(int outOrderId, int productId, int spaceId, Integer preOutStock) {
		this.outOrderId = outOrderId;
		this.productId = productId;
		this.spaceId = spaceId;
		this.preOutStock = preOutStock;
	}

	public ProductOutOrderSpace(int outOrderId, int productId, int spaceId, Integer preOutStock, int inOrderSpaceId) {
		this.outOrderId = outOrderId;
		this.productId = productId;
		this.spaceId = spaceId;
		this.preOutStock = preOutStock;
		this.inOrderSpaceId = inOrderSpaceId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOutOrderId() {
		return outOrderId;
	}

	public void setOutOrderId(int outOrderId) {
		this.outOrderId = outOrderId;
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

	public Integer getPreOutStock() {
		return preOutStock;
	}

	public void setPreOutStock(Integer preOutStock) {
		this.preOutStock = preOutStock;
	}

	public int getOutStock() {
		return outStock;
	}

	public void setOutStock(int outStock) {
		this.outStock = outStock;
	}

	public int getInOrderSpaceId() {
		return inOrderSpaceId;
	}

	public void setInOrderSpaceId(int inOrderSpaceId) {
		this.inOrderSpaceId = inOrderSpaceId;
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

	public ProductSpaceStock getSpaceStock() {
		return spaceStock;
	}

	public void setSpaceStock(ProductSpaceStock spaceStock) {
		this.spaceStock = spaceStock;
	}

}
