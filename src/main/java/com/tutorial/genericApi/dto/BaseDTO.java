package com.tutorial.genericApi.dto;

import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author invincibleelf
 *
 * Generic DTO
 */
@Getter
@Setter
@NoArgsConstructor
public class BaseDTO {
	
	@Id
	@NotNull
	private Long id;
	
	public BaseDTO (Long id) {
		this.id = id;
	}

}
