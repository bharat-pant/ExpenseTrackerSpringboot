package com.expenseTracker.springboot_app.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateUserDTO {
    private String name;
    private String password;
    private String email;
    private LocalDate createdAt;

    @Override
    public String toString() {
        return "AddUserDTO{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
