package com.example.LibrarayManagementSystem.Repositories;

import com.example.LibrarayManagementSystem.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

}
