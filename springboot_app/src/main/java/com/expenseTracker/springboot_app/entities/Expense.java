package com.expenseTracker.springboot_app.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/* Expense Class to store Expense data which will be used to
   map and store multiple transaction done by user */

@Entity
@Getter
@Setter

public class Expense {
    private long id;
    private User user;
    private String expenseType;
    private String expenseCategory;
    private long expenseAmount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", user=" + user +
                ", expenseType='" + expenseType + '\'' +
                ", expenseCategory='" + expenseCategory + '\'' +
                ", expenseAmount=" + expenseAmount +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
