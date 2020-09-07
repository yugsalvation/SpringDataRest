package com.spring.restexample.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.restexample.dao.CoursesDao;
import com.spring.restexample.entities.Courses;

@Service
@Repository
public class CoursesDaoImple implements CoursesDao {
	@Autowired
	private EntityManager entitymanager;
	private List l=new ArrayList<Courses>();
	CoursesDaoImple(){
		Courses c=new Courses();
		c.setCourse_id(1);
		c.setCourse_name("dada");
		
		l.add(c);
		
		
	}
	@Override
	@Transactional
	public List<Courses> getCourses() {
		Session currentSession=entitymanager.unwrap(Session.class);
		String query="from Courses";
		Query <Courses> theQuery=currentSession.createQuery(query,Courses.class);
		List<Courses>l=theQuery.getResultList();
		return l;
	}
	@Override
	@Transactional
	public int addCourse(Courses course) {
		Session currentSession=entitymanager.unwrap(Session.class);
		int id=(Integer)currentSession.save(course);
		return 0;
	}
	
	@Override
	@Transactional
	public int updateCourse(Courses course) {
		Session currentSession=entitymanager.unwrap(Session.class);
		currentSession.update(course);
		
		return 0;
	}
	@Override
	@Transactional
	public int deleteCourse(int courseId) {
		Session currentSession=entitymanager.unwrap(Session.class);
		String query="delete from Courses where course_id="+courseId;
		Query  theQuery=currentSession.createQuery(query);
		theQuery.executeUpdate();
		
		
		return 0;
	}


}
