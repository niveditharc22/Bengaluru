package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>
{
	
}