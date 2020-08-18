package com.tutorial.genericApi.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author invincibleelf
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class ApplicationUserDTO extends BaseDTO {

	@NotBlank
	private String username;

	@NotBlank
	private String password;

	public ApplicationUserDTO(Long id, String username, String password) {
		super(id);
		this.username = username;
		this.password = password;
	}

}
