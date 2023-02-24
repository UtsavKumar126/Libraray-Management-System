package com.example.LibrarayManagementSystem.Repositories;

import com.example.LibrarayManagementSystem.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions,Integer> {
}
