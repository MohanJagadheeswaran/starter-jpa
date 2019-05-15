package com.tivo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Student")
@Getter
@Setter
@ToString
public class Student {
	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
}
