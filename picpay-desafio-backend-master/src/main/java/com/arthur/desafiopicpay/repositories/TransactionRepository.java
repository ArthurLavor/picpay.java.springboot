package com.arthur.desafiopicpay.repositories;

import com.arthur.desafiopicpay.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
