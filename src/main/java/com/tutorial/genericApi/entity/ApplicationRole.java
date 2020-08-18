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
@Getter
@Setter
@NoArgsConstructor
public class ApplicationRole extends BaseEntity {
	
	@Column(nullable = false)
	private String role;

}
