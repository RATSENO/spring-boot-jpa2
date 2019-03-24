package me.ratseno.demojpa3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.ratseno.demojpa3.post.PostListener;
import me.ratseno.demojpa3.post.PostPublishedEvent;

@Configuration
public class PostRepositoryTestConfig {

	@Bean
	public ApplicationListener<PostPublishedEvent> postListener() {
		return event -> {

			System.out.println("===============================");
			System.out.println(event.getPost() + "is published");
			System.out.println("===============================");

		};
	}
}
