package com.tivo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tivo.vo.Config;

@Service
public class StdentService {

	@Autowired
	Config config;

	public void printStudent() {
		System.out.println("Stdent Config is " + config.getStudentHashmap());
	}
}
