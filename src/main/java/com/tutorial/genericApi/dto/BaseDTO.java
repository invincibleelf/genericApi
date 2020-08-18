package com.tutorial.genericApi.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BaseDTO {
	
	private Long id;
	
	public BaseDTO (Long id) {
		this.id = id;
	}

}
