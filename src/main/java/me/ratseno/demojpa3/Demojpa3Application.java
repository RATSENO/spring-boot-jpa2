package me.ratseno.demojpa3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(repositoryImplementationPostfix="Default")
public class Demojpa3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demojpa3Application.class, args);
	}

}
