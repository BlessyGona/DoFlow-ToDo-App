package com.Springbootpace.Springboot.Repository;

import com.Springbootpace.Springboot.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}