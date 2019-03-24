package me.ratseno.demojpa3;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class SimpleMyRepositoy<T, ID extends Serializable> extends QuerydslJpaRepository<T, ID>
		implements MyRepository<T, ID> {

	@Autowired
	private EntityManager entityManager;

	public SimpleMyRepositoy(JpaEntityInformation<T, ID> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public boolean contains(T entity) {
		return entityManager.contains(entity);
	}

}
