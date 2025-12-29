package com.retoaws.user_endpoint.repository;

import com.retoaws.user_endpoint.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos personalizados si es necesario
}
