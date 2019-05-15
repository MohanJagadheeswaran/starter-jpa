package com.tivo.vo;

import java.util.List;
import java.util.Map;

import com.tivo.dto.Student;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Config {
	private Map<String, List<Student>> studentHashmap;
}
