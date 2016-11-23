package com.veligosha.server.repository;

import com.veligosha.server.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by root on 15.11.16.
 */
public interface TestRepository extends JpaRepository<Test, Long> {
}
