package com.project.StudenRecordProject.Services;

import com.project.StudenRecordProject.DAO.StudentDao;
import com.project.StudenRecordProject.Interfaces.StudentService;
import com.project.StudenRecordProject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getStudents() {
        return  studentDao.findAll();
    }

    @Override
    public Optional<Student> getStudent(Integer ID) {
        Optional<Student> student=studentDao.findById(ID);
        return student;
    }

    @Override
    public Student updateStudent(Student student) {
        studentDao.save(student);
        return student;
    }

    @Override
    public Student postStudent(Student student) {
        studentDao.save(student);
        return student;
    }

    @Override
    public String deleteStudent(Integer ID) {
        Optional<Student> student=studentDao.findById(ID);
        if(student!=null){
            studentDao.deleteById(ID);
            return "Success";
        }
        return "ID not found";
    }
}
