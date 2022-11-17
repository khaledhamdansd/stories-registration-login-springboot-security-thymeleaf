package com.webservics.youngstar.YoungStarServices.repository;

import com.webservics.youngstar.YoungStarServices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}