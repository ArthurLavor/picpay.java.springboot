package com.arthur.desafiopicpay.controllers;

import com.arthur.desafiopicpay.domain.Transaction;
import com.arthur.desafiopicpay.dtos.TransactionDTO;
import com.arthur.desafiopicpay.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {
        Transaction newTransaction = transactionService.createTransaction(transactionDTO);
        return new ResponseEntity<>(newTransaction, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> listAllTransactions() {
        var transactions = transactionService.getAllTransactions();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }
}
