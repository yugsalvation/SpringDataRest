package com.spring.restexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Table(name = "course")
public class Courses {
	@Id
	@Column(name = "idcourse")
private int course_id;
	@Column(name = "coursename")
private String course_name;
	@Column(name = "coursetype")
	private String course_type;
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public String getCourse_name() {
	return course_name;
}
public void setCourse_name(String course_name) {
	this.course_name = course_name;
}
public String getCourse_type() {
	return course_type;
}
public void setCourse_type(String course_type) {
	this.course_type = course_type;
}

}
