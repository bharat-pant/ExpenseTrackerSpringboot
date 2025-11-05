package com.expenseTracker.springboot_app.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/* User Class to store User data which will be used to
   map and store multiple user when they do login */

@Entity
@Getter
@Setter
public class User {
    private long id;
    private String name;
    private String password;
    private String email;
    private LocalDateTime createdAt;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
