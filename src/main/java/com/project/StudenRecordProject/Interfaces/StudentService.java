package com.project.StudenRecordProject.Interfaces;

import com.project.StudenRecordProject.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    public List<Student> getStudents();
    public Optional<Student> getStudent(Integer ID);
    public Student postStudent(Student student);
    public Student updateStudent(Student student);
    public String deleteStudent(Integer ID);
}
