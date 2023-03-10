package com.example.LibrarayManagementSystem.Controllers;

import com.example.LibrarayManagementSystem.DTO.AuthorEntryDTO;
import com.example.LibrarayManagementSystem.Models.Author;
import com.example.LibrarayManagementSystem.Servies.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {


    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody AuthorEntryDTO authorEntryDTO){

        return authorService.createAuthor(authorEntryDTO);
    }

}
