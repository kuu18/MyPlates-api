package com.kuu.MyPlates.repository;

import com.kuu.MyPlates.entity.MealRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealRepository extends JpaRepository<MealRecord, Long> {
    List<MealRecord> findAll();
}
