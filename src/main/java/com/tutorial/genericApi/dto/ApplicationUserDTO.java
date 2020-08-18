package com.tutorial.genericApi.dto;

import java.util.Set;

import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

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

	public ApplicationUserDTO(Long id, String username, String password,Set< ApplicationRoleDTO> roles) {
		super(id);
		this.username = username;
		this.password = password;
	}

}
