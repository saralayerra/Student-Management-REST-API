package om.springboot.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.springboot.restapi.entity.Student;
import om.springboot.restapi.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Student findById(long id) {
		
		
		Student student=studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found with id " + id));
		return student;
	}

	@Override
	public List<Student> findAll() {
		
		
		List<Student> student=studentRepository.findAll();
		
		return student;
	}

	

	@Override
	public Student update(Student student) {
		
		return studentRepository.save(student);
	}

	

	

	@Override
	public Student insert(Student student) {
	
		
		return studentRepository.save(student);
	}

	@Override
	public void delete(long id) {
		studentRepository.deleteById(id);
		
	}

	
	
	
	
	
	

}
