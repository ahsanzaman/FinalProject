package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "posbravo")
public class Role implements java.io.Serializable {

	private Integer roleId;
	private String roleCategory;
	private Integer accessControlId;

	public Role() {
	}

	public Role(String roleCategory, Integer accessControlId) {
		this.roleCategory = roleCategory;
		this.accessControlId = accessControlId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RoleID", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "RoleCategory")
	public String getRoleCategory() {
		return this.roleCategory;
	}

	public void setRoleCategory(String roleCategory) {
		this.roleCategory = roleCategory;
	}

	@Column(name = "AccessControlID")
	public Integer getAccessControlId() {
		return this.accessControlId;
	}

	public void setAccessControlId(Integer accessControlId) {
		this.accessControlId = accessControlId;
	}

}