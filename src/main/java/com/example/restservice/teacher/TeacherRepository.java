package com.example.restservice.teacher;

import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

//	List<Teacher> findByName(String name);
	

}
