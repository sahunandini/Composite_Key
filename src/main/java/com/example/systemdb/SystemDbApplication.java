package com.example.systemdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/test1")
public class SystemDbApplication {

	@Autowired
	private TestRepository repository;

	@PostMapping
	public Test save(@RequestBody Test test1) {
		return repository.save(test1);
	}

	@GetMapping
	public List<Test> getAll() {
		return repository.findAll();
	}
	public static void main(String[] args) {
		SpringApplication.run(SystemDbApplication.class, args);
	}

}
