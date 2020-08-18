package com.tutorial.genericApi.service;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.tutorial.genericApi.dto.BaseDTO;
import com.tutorial.genericApi.entity.BaseEntity;
import com.tutorial.genericApi.repository.BaseRepository;
import com.tutorial.genericApi.utils.GenericMapperUtil;

/**
 * @author invincibleelf
 * 
 * Generic Service 
 *
 * @param <D> of type {@link BaseDTO}
 * @param <E> of type {@link BaseEntity}
 */
public abstract class GenericService<D extends BaseDTO, E extends BaseEntity> {

	private final Class<D> dtoClass;
	
	private final Class<E> entityClass;
	
	@Autowired
	protected BaseRepository<E> repository;

	@Autowired
	protected GenericMapperUtil mapperUtil;

	public GenericService() {
		this.dtoClass = getDtoClass();
		this.entityClass = getEntityClass();
	}
	
	

	public List<D> list() {
		return (List<D>) mapperUtil.mapList(repository.findAll(), dtoClass);

	}
	
	public D get(@PathVariable("id") Long id) {
		return mapperUtil.mapModel(repository.getOne(id), dtoClass);
	}
	
	@Transactional
	public D create(D dto) {
		
		E entity = mapperUtil.mapModel(dto, entityClass);
		repository.save(entity);
		return mapperUtil.mapModel(entity, dtoClass);
	}
	
	@Transactional
	public D update(Long id , D dto) {
		E entity = repository.getOne(id);
		mapperUtil.mapModel(dto, entity);
		repository.save(entity);
		return mapperUtil.mapModel(entity,dtoClass);
		
	}
	
	public void delete(Long id) {
		E entity = repository.getOne(id);
		repository.delete(entity);
	}
	
	
	/** Method to get class type of implementation class of {@link BaseDTO}
	 * @return 
	 */
	@SuppressWarnings("unchecked")
    private Class<D> getDtoClass() {
        return (Class<D>) ((ParameterizedType) getClass().getGenericSuperclass())
           .getActualTypeArguments()[0];
    }
	
	/** Method to get class type of implementation class of {@link BaseEntity}
	 * @return 
	 */
	@SuppressWarnings("unchecked")
    private Class<E> getEntityClass() {
        return (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass())
           .getActualTypeArguments()[1];
    }


}
