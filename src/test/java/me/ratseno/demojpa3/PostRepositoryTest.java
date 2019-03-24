package me.ratseno.demojpa3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import me.ratseno.demojpa3.post.Post;
import me.ratseno.demojpa3.post.PostPublishedEvent;
import me.ratseno.demojpa3.post.PostRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PostRepositoryTestConfig.class)
public class PostRepositoryTest {

	@Autowired
	PostRepository postRepository;

	@Test
	public void crud() {
		Post post = new Post();
		post.setTitle("hibernate");

		assertThat(postRepository.contains(post)).isFalse();

		postRepository.save(post.publish());

		assertThat(postRepository.contains(post)).isTrue();

		postRepository.delete(post);
		postRepository.flush();
	}
}
