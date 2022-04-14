package com.swathi.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.data.model.Student;
import com.swathi.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentservice;

	//@Autowired
	//public StudentController(StudentService studentservice) {
		//this.studentservice = studentservice;
	//}

	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return studentservice.getAllStudents();
	}

	@GetMapping("/student{id}")
	public Optional<Student> getById(@PathVariable("id") int id) {
		return studentservice.findById(id);
	}

	@PostMapping("/student")

	public Student addStudent(@RequestBody Student std) {
		return studentservice.save(std);
	}

	@PutMapping("/student/{id}")
	public Optional<Student> updateStudent(@PathVariable("id") int id) {
		return studentservice.findById(id);
	}

	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable("id") int id) {
		studentservice.deleteById(id);
	}

}
