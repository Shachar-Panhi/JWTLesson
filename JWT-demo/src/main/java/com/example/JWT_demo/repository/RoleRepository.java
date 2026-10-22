package com.example.JWT_demo.repository;

import com.example.JWT_demo.entity.Role;
import com.example.JWT_demo.entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);
}
