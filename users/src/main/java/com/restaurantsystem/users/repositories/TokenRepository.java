package com.restaurantsystem.users.repositories;

import com.restaurantsystem.users.entities.AuthenticationToken;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken,Long> {
    
}
