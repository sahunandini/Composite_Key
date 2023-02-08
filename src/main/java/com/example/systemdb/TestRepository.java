package com.example.systemdb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, CompositeKey> {
}
