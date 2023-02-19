package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.Enums.CardStatus;
import com.example.LibrarayManagementSystem.Models.Card;
import com.example.LibrarayManagementSystem.Models.Student;
import com.example.LibrarayManagementSystem.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
