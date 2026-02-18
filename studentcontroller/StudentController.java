package om.springboot.restapi.studentcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import om.springboot.restapi.entity.Student;
import om.springboot.restapi.service.StudentService;

@RestController
public class StudentController {
	


	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	 
	@Autowired
	private StudentService studentService;
	
	
	  @GetMapping("/students/{id}")//path variable
	  public Student getId(@PathVariable("id") long id) {
	  
	
	  
	  return studentService.findById(id);
	  }
	 
	
	
	@GetMapping("/students/")
	public List<Student> getAll()
	{
		List<Student> student=studentService.findAll();
		
		return student;
	}
	
	@PostMapping("/students/")
	public Student insert(@RequestBody Student student)
	{
		
		Student st=studentService.insert(student);
		
		return st;
	}
	
	@PutMapping("/students/")
	public Student update(@RequestBody Student student)
	{
		return studentService.insert(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void delete(@PathVariable("id") long id)
	{
		//Student student =studentService.findById(id);
		studentService.delete(id);
	}
	
	@PutMapping("/students/{id}")
	public Student updateById(@RequestBody Student student,@PathVariable("id") long id)
	{
		Student student1=studentService.findById(id);
		
		student1.setName(student.getName());
		
		student1.setDepartment(student.getDepartment());
		
		student1.setCgpa(student.getCgpa());
		
		return studentService.update(student1);
	}
	
	@PatchMapping("/students/{id}")
	public Student insertSpeafic(@RequestBody Student student,@PathVariable("id") long id)
	{
		Student st=studentService.findById(id);
		
		 if (student.getName() != null) {
	        st.setName(student.getName());
	    }

	    if (student.getDepartment() != null) {
	        st.setDepartment(student.getDepartment());
	    }

	    if (student.getCgpa() != 0) {
	        st.setCgpa(student.getCgpa());
	    }

	    return studentService.update(st);
			
		
	}
	

}
