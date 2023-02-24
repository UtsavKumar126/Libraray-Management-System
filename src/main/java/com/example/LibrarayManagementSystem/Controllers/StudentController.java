package com.example.LibrarayManagementSystem.Controllers;

import com.example.LibrarayManagementSystem.DTO.StudentNoUpdate;
import com.example.LibrarayManagementSystem.Models.Student;
import com.example.LibrarayManagementSystem.Servies.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }

    @GetMapping("/get_user")
    public String getNameByEmail(@RequestParam("email")String email){

        return studentService.findNameByEmail(email);
    }
    @GetMapping("/get_list")
    public List<Student> studentList(@RequestParam("country")String country){

        return studentService.findByCountry(country);
    }

    @PutMapping("/update_mob")
    public String updateMob(@RequestBody StudentNoUpdate studentNoUpdate){

       return studentService.updateMobNo(studentNoUpdate);
    }
}
