package com.tutorial.genericApi.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApplicationRoleDTO extends BaseDTO {
	
	@NotBlank
	private String role;

	public ApplicationRoleDTO(Long id, String role) {
		super(id);
		this.role = role;
	}

}
