package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Transactional
    @Modifying
	@Query("delete from Student s where s.id = ?1")
    void deleteStudent(int id);
}
