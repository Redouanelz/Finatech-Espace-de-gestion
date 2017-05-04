package com.example.model;
// Generated Apr 18, 2017 6:49:25 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "Redouane")
public class Role implements java.io.Serializable {

	private Integer id;
	private String label;
	private Set<User> users = new HashSet<User>(0);

	public Role() {
	}

	public Role(String label) {
		this.label = label;
	}

	public Role(String label, Set<User> users) {
		this.label = label;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "label", nullable = false, length = 50)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_role", catalog = "Redouane", joinColumns = {
			@JoinColumn(name = "id_role", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_user", nullable = false, updatable = false) })
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
