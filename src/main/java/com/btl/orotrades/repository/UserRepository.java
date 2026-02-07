package com.btl.orotrades.repository;

import com.btl.orotrades.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByPancardNo(String pancardNo);
}