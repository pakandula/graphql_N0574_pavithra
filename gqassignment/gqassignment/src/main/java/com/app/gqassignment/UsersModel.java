package com.app.gqassignment;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userstable", schema = "public", catalog = "lsh")
public class UsersModel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id", nullable = false)
	private long id;
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	@Basic
	@Column(name = "email", nullable = false, length = 255)
	private String email;
	@Basic
	@Column(name = "username", nullable = false, length = 255)
	private String username;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
