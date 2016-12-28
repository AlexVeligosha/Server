package com.veligosha.server.repository;

import com.veligosha.server.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long>{
}
