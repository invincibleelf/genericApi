package com.tutorial.genericApi.service;

import org.springframework.stereotype.Service;

import com.tutorial.genericApi.dto.ApplicationUserDTO;
import com.tutorial.genericApi.entity.ApplicationUser;

@Service
public class ApplicationUserService extends GenericService<ApplicationUserDTO, ApplicationUser> {

}
