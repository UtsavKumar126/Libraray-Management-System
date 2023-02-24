package com.example.LibrarayManagementSystem.Servies;

import com.example.LibrarayManagementSystem.DTO.IssueBookReuestDTO;
import com.example.LibrarayManagementSystem.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;


    public String issueBook(IssueBookReuestDTO issueBookReuestDTO){
        return "";
    }
}
