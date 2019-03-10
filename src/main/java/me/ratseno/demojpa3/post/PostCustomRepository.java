package me.ratseno.demojpa3.post;

import java.util.List;

public interface PostCustomRepository<T> {

	List<Post> findMyPost();

	void delete(T entity);
}
