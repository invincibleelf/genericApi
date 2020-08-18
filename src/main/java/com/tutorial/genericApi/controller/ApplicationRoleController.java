package com.tutorial.genericApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.genericApi.dto.ApplicationRoleDTO;
import com.tutorial.genericApi.entity.ApplicationRole;
import com.tutorial.genericApi.service.ApplicationRoleService;

@RestController
@RequestMapping("roles")
public class ApplicationRoleController extends GenericRestController<ApplicationRoleService, ApplicationRoleDTO, ApplicationRole> {

}
