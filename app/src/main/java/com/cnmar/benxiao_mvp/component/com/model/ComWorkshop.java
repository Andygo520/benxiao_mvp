package com.cnmar.benxiao_mvp.component.com.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

import component.system.model.SystemUser;

/** 车间 */
@SuppressWarnings("serial")
public class ComWorkshop implements Serializable {

	@JSONField(ordinal = 1)
	private int id;
	@JSONField(ordinal = 2)
	private String name; // 名称
	@JSONField(serialize = false)
	private Boolean isDel;

	@JSONField(serialize = false)
	private List<SystemUser> users;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public List<SystemUser> getUsers() {
		return users;
	}

	public void setUsers(List<SystemUser> users) {
		this.users = users;
	}

}
