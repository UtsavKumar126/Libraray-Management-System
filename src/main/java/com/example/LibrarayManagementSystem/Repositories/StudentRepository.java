package com.example.LibrarayManagementSystem.Repositories;

import com.example.LibrarayManagementSystem.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    public Student findByEmail(String email);

    public List<Student> findByCountry(String country);
}
