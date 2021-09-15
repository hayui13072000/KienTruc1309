package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query(value = "SELECT * FROM Student WHERE name = 'ha'", nativeQuery = true)
	List<Student> findBooksWithLanguage();

	@Query(value = "SELECT * FROM Book WHERE age > 5", nativeQuery = true)
	List<Student> findBooksWithPaperback();


}
