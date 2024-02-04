package com.HermeshqApi.interfaces;

import com.HermeshqApi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories(basePackages = "com.HermeshqApi.interfaces")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /*This indicates that UserRepository extends the JpaRepository interface.
    The JpaRepository is part of Spring Data JPA and provides generic CRUD (Create, Read, Update, Delete)
    operations for the User entity. The User is the type of entity managed by this repository,
    and Long is the type of the entity's primary key.
     */
    User findByEmail(String email);
    /*In addition to the methods provided by JpaRepository, the UserRepository interface
    also declares a custom method called findByEmail().
    This method uses Spring Data JPA s method name query creation feature to generate a query that finds a user by
     their email address. The method takes a single argument, which is the email address to search for,
     and it returns a User object if a match is found, or null otherwise.
     */

}
