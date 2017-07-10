package com.cnmar.benxiao_mvp.component.company.model;

import com.alibaba.fastjson.annotation.JSONField;

import component.common.model.ImgModel;

/** 企业 */
public class Company extends ImgModel {

	@JSONField(ordinal = 1)
	private String name; // 企业名称
	@JSONField(ordinal = 2)
	private String tel; // 电话
	@JSONField(ordinal = 3)
	private String fax; // 传真
	@JSONField(ordinal = 4)
	private String address; // 地址
	@JSONField(ordinal = 5)
	private String intro; // 简介
	@JSONField(ordinal = 6)
	private String contact; // 联系人
	@JSONField(ordinal = 7)
	private String job; // 职位
	@JSONField(ordinal = 8)
	private String phone; // 手机号
	@JSONField(ordinal = 9)
	private String email; // 邮箱
	@JSONField(ordinal = 10)
	private String qrcode; // 二维码相对路径

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQrcode() {
		return qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}

}
