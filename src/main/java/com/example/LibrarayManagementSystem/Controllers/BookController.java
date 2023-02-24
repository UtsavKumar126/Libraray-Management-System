package com.example.LibrarayManagementSystem.Controllers;

import com.example.LibrarayManagementSystem.DTO.BookRequestDTO;
import com.example.LibrarayManagementSystem.Models.Book;
import com.example.LibrarayManagementSystem.Servies.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public String addBook(@RequestBody BookRequestDTO bookdto){
        return bookService.addBook(bookdto);
    }
}
