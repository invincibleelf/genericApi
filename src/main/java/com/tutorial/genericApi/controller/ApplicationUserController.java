package com.tutorial.genericApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genericApi.dto.ApplicationUserDTO;
import com.tutorial.genericApi.entity.ApplicationUser;
import com.tutorial.genericApi.service.ApplicationUserService;

@RestController
@RequestMapping("users")
public class ApplicationUserController extends GenericRestController<ApplicationUserService, ApplicationUserDTO, ApplicationUser> {
	
}
