package com.cnmar.benxiao_mvp.component.system.model;

/** 角色权限关系 */
public class SystemRoleAuth {

	private int id;
	private int roleId; // 角色id
	private int authId; // 权限id

	public SystemRoleAuth() {

	}

	public SystemRoleAuth(int roleId, int authId) {
		this.roleId = roleId;
		this.authId = authId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

}
