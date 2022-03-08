package com.restaurantsystem.users.repositories;

import com.restaurantsystem.users.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Long> {

    UsersEntity findByEmail(String email);


}