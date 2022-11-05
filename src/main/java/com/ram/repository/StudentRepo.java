package com.ram.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ram.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

//	@Query("SELECT s from Student s where s.email = ?")
	Optional<Student> findStudentByEmail(String email);

}
