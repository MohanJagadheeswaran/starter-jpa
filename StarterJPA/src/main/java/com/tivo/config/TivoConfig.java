package com.tivo.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tivo.dto.Student;
import com.tivo.repo.StudentRepo;
import com.tivo.vo.Config;

@Configuration
public class TivoConfig {

	@Autowired
	StudentRepo studentRepo;

	@Bean
	public Config getConfigs() {
		Config config = new Config();
		Map<String, List<Student>> studentHashMap = new HashMap<>();
		studentHashMap.put("Test", studentRepo.findAll());
		config.setStudentHashmap(studentHashMap);
		return config;
	}

}
