package com.expenseTracker.springboot_app.dto;

import com.expenseTracker.springboot_app.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseDTO {
    private long id;
    private User user;
    private String expenseType;
    private String expenseCategory;
    private long expenseAmount;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "ExpenseDTO{" +
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
