package com.codeclan.example.newspringapp;

import com.codeclan.example.newspringapp.models.Employee;
import com.codeclan.example.newspringapp.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewspringappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee dave = new Employee("Dave", 26, 1994, "daveybaby@ravey.com");
		employeeRepository.save(dave);
	}

}
