package om.springboot.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import om.springboot.restapi.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
