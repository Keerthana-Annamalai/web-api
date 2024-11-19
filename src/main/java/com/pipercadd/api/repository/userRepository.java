package com.pipercadd.api.repository;

import com.pipercadd.api.userdetails.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {
}
