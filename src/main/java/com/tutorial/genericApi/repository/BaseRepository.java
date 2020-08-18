package com.tutorial.genericApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.genericApi.entity.BaseEntity;

public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long>{

}
