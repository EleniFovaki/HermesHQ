package com.HermeshqApi.interfaces;

import com.HermeshqApi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    /*This indicates that UserRepository extends the JpaRepository interface.
    The JpaRepository is part of Spring Data JPA and provides generic CRUD (Create, Read, Update, Delete)
    operations for the User entity. The User is the type of entity managed by this repository,
    and Long is the type of the entity's primary key.
     */
    User findByEmail(String email);
}
