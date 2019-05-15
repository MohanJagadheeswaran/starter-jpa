package com.tivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tivo.service.StdentService;

@SpringBootApplication
public class StarterJpaApplication implements CommandLineRunner {

	@Autowired
	StdentService stuService;

	public static void main(String[] args) {
		SpringApplication.run(StarterJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		stuService.printStudent();
	}

}
