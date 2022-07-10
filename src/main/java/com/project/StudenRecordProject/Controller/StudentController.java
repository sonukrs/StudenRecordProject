package com.project.StudenRecordProject.Controller;

import com.project.StudenRecordProject.Interfaces.StudentService;
import com.project.StudenRecordProject.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/home")
    public String home(){
        return "this is home controller";
    }
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
    @RequestMapping(value = "/students/{ID}",method = RequestMethod.GET)
    public Optional<Student> getStudent(@PathVariable String ID){
        Optional<Student> student=studentService.getStudent(Integer.parseInt(ID));
        try {
            if (student!=null){
                return student;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    @RequestMapping(value="/students",method = RequestMethod.POST)
    public Student postStudent(@RequestBody Student student){
        studentService.postStudent(student);
        return student;
    }
    @RequestMapping(value = "/students",method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        Student updated=studentService.updateStudent(student);
        return updated;
    }
    @RequestMapping(value = "/students/{ID}",method = RequestMethod.DELETE)
    public String deleteStudent(@PathVariable String ID){
        String returnVal=studentService.deleteStudent(Integer.parseInt(ID));
        return returnVal;
    }
}
