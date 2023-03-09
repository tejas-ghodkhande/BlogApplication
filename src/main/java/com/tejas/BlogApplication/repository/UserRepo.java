package com.tejas.BlogApplication.repository;

import com.tejas.BlogApplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
