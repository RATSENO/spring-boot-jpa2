package me.ratseno.demojpa3.post;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PostCustomRepositoryImpl implements PostCustomRepository<Post> {

	@Autowired
	EntityManager entityManager;

	@Override
	public List<Post> findMyPost() {
		System.out.println("custom findMyPost");
		return entityManager.createQuery("SELECT p FROM Post AS p", Post.class).getResultList();
	}

	@Override
	public void delete(Post entity) {
		System.out.println("custom delete");
		entityManager.remove(entity);
	}

}
