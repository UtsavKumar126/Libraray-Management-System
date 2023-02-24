package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.DTO.AuthorEntryDTO;
import com.example.LibrarayManagementSystem.Models.Author;
import com.example.LibrarayManagementSystem.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorEntryDTO authorEntryDTO){

        Author author=new Author();
        author.setName(authorEntryDTO.getName());
        author.setAge(authorEntryDTO.getAge());
        author.setCountry(authorEntryDTO.getCountry());
        author.setRating(authorEntryDTO.getRating());


        authorRepository.save(author);
        return "Author added Successfully";
    }
}
