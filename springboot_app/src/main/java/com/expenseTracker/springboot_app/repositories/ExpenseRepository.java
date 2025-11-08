package com.expenseTracker.springboot_app.repositories;

import com.expenseTracker.springboot_app.entities.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Long, Expense> {
}
