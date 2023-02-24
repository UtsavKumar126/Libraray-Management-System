package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.DTO.StudentNoUpdate;
import com.example.LibrarayManagementSystem.Enums.CardStatus;
import com.example.LibrarayManagementSystem.Models.Card;
import com.example.LibrarayManagementSystem.Models.Student;
import com.example.LibrarayManagementSystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){

        Card card=new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);
        return "Student and Card added ";
    }

    public String findNameByEmail(String email){

        Student student=studentRepository.findByEmail(email);

        return student.getName();
 }
  public List<Student> findByCountry(String country){
      return studentRepository.findByCountry(country);
  }

  public String updateMobNo(StudentNoUpdate studentNoUpdate){

        Student oldStudent=studentRepository.findById(studentNoUpdate.getId()).get();

        oldStudent.setMobNo(studentNoUpdate.getMobNo());

        studentRepository.save(oldStudent);

        return "updated Successfully";
}
}
