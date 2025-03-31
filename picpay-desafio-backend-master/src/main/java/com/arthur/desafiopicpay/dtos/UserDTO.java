package com.arthur.desafiopicpay.dtos;

import com.arthur.desafiopicpay.domain.UserType;

import java.math.BigDecimal;

public record UserDTO(
        String name,
        String email,
        String password,
        String document,
        BigDecimal balance,
        UserType userType
) {

}
