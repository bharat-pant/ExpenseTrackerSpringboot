package com.expenseTracker.springboot_app.repositories;

import com.expenseTracker.springboot_app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Long, User> {
}
