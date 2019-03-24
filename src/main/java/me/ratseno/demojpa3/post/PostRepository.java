package me.ratseno.demojpa3.post;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import me.ratseno.demojpa3.MyRepository;

//public interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository<Post> {
public interface PostRepository extends MyRepository<Post, Long>, QuerydslPredicateExecutor<Post> {

}
