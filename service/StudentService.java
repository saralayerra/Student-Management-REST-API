package om.springboot.restapi.service;


import java.util.List;

import om.springboot.restapi.entity.Student;

public interface StudentService {
	
	
	public Student findById(long id);
	
	
	public List<Student> findAll();
	
	public void delete(long id);
	
	public Student update(Student student);
	
	public Student insert(Student student);
	
	

}
