package com.kuu.MyPlates.controller;

import com.kuu.MyPlates.entity.MealRecord;
import com.kuu.MyPlates.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/meal")
@CrossOrigin(origins = "*") // React Native からのアクセス許可
@RequiredArgsConstructor
public class MealController {

    private final MealRepository repository;

    @PostMapping
    public ResponseEntity<MealRecord> save(@RequestBody MealRecord record) {
        return ResponseEntity.ok(repository.save(record));
    }

    @GetMapping
    public List<MealRecord> getAll() {
        return repository.findAll();
    }
}
