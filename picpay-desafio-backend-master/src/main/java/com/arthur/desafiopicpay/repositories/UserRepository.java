package com.arthur.desafiopicpay.repositories;

import com.arthur.desafiopicpay.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
