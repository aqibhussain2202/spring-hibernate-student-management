package com.spring.orm.dao;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;





public class StudentDao {
	private HibernateTemplate hibernateTemplate;

    
	
    public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}



	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}



	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Transactional
	public int insert(Student student) {
        // Insert
		Integer i=(Integer)this.hibernateTemplate.save(student);
		return i;
    }
	public Student getStudent(int studentId)
	{
		Student student =this.hibernateTemplate.get(Student.class,studentId);
		return student;
	}
	public List<Student> getAllStudents()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	@Transactional
	public void delete(int studentId)
	{
		Student student =this.hibernateTemplate.get(Student.class,studentId);
		this.hibernateTemplate.delete(student);
	}
	@Transactional
	public void update(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	}
