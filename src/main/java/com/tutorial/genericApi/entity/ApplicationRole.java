package com.tutorial.genericApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author invincibleelf
 *
 */
@Entity
@Table(name = "roles")
public class ApplicationRole extends BaseEntity {
	
	@Column(nullable = false)
	private String role;
	
	public ApplicationRole() {
		super();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
