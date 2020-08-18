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
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class ApplicationUser extends BaseEntity{

	@Column(nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
//	@ManyToMany (fetch = FetchType.LAZY, targetEntity = ApplicationRole.class)
//	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
//	private Set<ApplicationRole> roles;
	
}
