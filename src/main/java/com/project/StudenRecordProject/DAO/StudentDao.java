package com.project.StudenRecordProject.DAO;

import com.project.StudenRecordProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}
