package com.spring.restexample.dao;

import java.util.List;

import com.spring.restexample.entities.Courses;

public interface CoursesDao {
public List<Courses> getCourses();
public int addCourse(Courses course);
public int updateCourse(Courses course);
public int deleteCourse(int courseId);
}
