package com.veligosha.server.repository;

import com.veligosha.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 */

public interface UserRepository extends JpaRepository<User, Long>{
}
