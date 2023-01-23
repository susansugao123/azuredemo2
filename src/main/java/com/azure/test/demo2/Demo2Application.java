package com.azure.test.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Demo2Application {
    @Autowired
	private EmployeeRepo empRepo;
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
    @PostMapping("/product")
	public Employee addEmployee (@RequestBody Employee emp) {
		return empRepo.save(emp);
	}
    @GetMapping("products")
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}
}
