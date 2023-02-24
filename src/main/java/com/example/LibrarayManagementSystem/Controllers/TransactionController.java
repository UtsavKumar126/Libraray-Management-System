package com.example.LibrarayManagementSystem.Controllers;

import com.example.LibrarayManagementSystem.DTO.IssueBookReuestDTO;
import com.example.LibrarayManagementSystem.Servies.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;


    @PostMapping("issueBook")
    public String issueBook(@RequestBody IssueBookReuestDTO issueBookReuestDTO){
        return transactionService.issueBook(issueBookReuestDTO);
    }

}
