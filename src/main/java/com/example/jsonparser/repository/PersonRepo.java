package com.example.jsonparser.repository;

import com.example.jsonparser.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Persons,Integer> {
}
