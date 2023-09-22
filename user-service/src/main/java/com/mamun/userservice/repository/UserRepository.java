package com.mamun.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mamun.userservice.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

}