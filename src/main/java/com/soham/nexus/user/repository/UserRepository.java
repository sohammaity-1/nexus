package com.soham.nexus.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soham.nexus.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}