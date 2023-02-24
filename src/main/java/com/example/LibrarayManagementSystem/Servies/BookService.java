package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.DTO.BookRequestDTO;
import com.example.LibrarayManagementSystem.Models.Author;
import com.example.LibrarayManagementSystem.Models.Book;
import com.example.LibrarayManagementSystem.Repositories.AuthorRepository;
import com.example.LibrarayManagementSystem.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;
    public String addBook(BookRequestDTO bookRequestDTO){
        int authorId=bookRequestDTO.getAuthorId();

        Author author=authorRepository.findById(authorId).get();


        Book book=new Book();
        book.setName(bookRequestDTO.getName());
        book.setPages(bookRequestDTO.getPages());
        book.setGenre(bookRequestDTO.getGenre());
        book.setBookIssued(false);
        book.setAuthor(author);

        List<Book>currentBooks=author.getBookWritten();
        currentBooks.add(book);
        //author.setBookWritten(currentBooks);


        authorRepository.save(author);

        return "book added successfully";
    }
}
