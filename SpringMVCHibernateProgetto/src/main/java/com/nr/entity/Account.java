package com.nr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String email;
	@Column
	private String username;
	@Column(name="pass")
	private String password;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	@OneToOne(mappedBy = "acc")
	private Team team;
	public Account() {}
	public Account(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}
	
}
