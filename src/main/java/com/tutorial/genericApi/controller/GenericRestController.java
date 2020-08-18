package com.tutorial.genericApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tutorial.genericApi.dto.BaseDTO;
import com.tutorial.genericApi.entity.BaseEntity;
import com.tutorial.genericApi.service.GenericService;

public class GenericRestController<S extends GenericService<D, E>, D extends BaseDTO, E extends BaseEntity>{
	
	@Autowired
	GenericService<D, E> service;
	
	@GetMapping(value = "")
	public ResponseEntity<?> list(){
		return ResponseEntity.ok().body(service.list());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> get(@PathVariable("id") Long id){
		
		return ResponseEntity.ok().body(service.get(id));
	}
	
	@PostMapping(value = "")
	public ResponseEntity<?> create(@RequestBody D dto){
	
		return ResponseEntity.ok().body(service.create(dto));
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<?> update(@PathVariable("id")Long id, @RequestBody D dto){
	
		return ResponseEntity.ok().body(service.update(id, dto));
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().body("Deleted successfully");
	}
	

}
