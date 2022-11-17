package com.webservics.youngstar.YoungStarServices.repository;

import com.webservics.youngstar.YoungStarServices.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}