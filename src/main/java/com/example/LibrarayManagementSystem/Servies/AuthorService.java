package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.Models.Author;
import com.example.LibrarayManagementSystem.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(Author author){

        authorRepository.save(author);

        return "Author added Successfully";
    }
}
