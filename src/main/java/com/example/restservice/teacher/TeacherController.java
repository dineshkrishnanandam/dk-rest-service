package com.example.restservice.teacher;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	@Autowired
	TeacherRepository teacherRepository;

	@PostMapping("/teachers")
	public Teacher createTeacher(@RequestBody Teacher teacher) throws IOException {
		System.out.println("...CreateTeacher... ");
		teacherRepository.save(teacher);
		return teacher;

	}

	@GetMapping("/teachers")
	public Iterable<Teacher> getAllTeachersInfo() {

		System.out.println("Getting All Teachers Info");

		return teacherRepository.findAll();
	}

	@GetMapping("/teachers/{id}")
	public Teacher getTeacherById(@PathVariable Integer id) {

		System.out.println("id =" + id);

		Optional<Teacher> ot = teacherRepository.findById(id);
		return ot.orElse(new Teacher());

	}

	@DeleteMapping("/teachers/{id}")
	public void deleteTeacherById(@PathVariable Integer id) {

		System.out.println("Deleting teacher by id =" + id);

		teacherRepository.deleteById(id);

	}

//	@GetMapping("/teachers")
//	public List<Teacher> getTeacherByName(String name) {
//
//		
//		
//		return teacherRepository.findByName(name);
//
//	}

}
