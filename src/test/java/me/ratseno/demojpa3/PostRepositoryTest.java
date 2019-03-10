package me.ratseno.demojpa3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import me.ratseno.demojpa3.post.Post;
import me.ratseno.demojpa3.post.PostRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

	@Autowired
	PostRepository postRepository;

	@Test
	public void crud() {
		Post post = new Post();
		post.setTitle("hibernate");
		postRepository.save(post);

		postRepository.findMyPost();

		postRepository.delete(post);
		postRepository.flush();
	}
}
