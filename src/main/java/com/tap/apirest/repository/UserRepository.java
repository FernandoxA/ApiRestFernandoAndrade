package com.tap.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tap.apirest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
