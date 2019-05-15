package com.tivo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tivo.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
