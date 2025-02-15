package com.Jpura.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create Employee
    @PostMapping("/addEmployee")
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employee) {
        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    // Create list of Employees
    @PostMapping("/addEmployees")
    public ResponseEntity<List<EmployeeModel>> createEmployees(@RequestBody List<EmployeeModel> employees) {
        List<EmployeeModel> savedEmployees = employeeRepository.saveAll(employees);
        return ResponseEntity.ok(savedEmployees);
    }

    // Get Employee by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .map(employee -> ResponseEntity.ok(employee))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    // Get All Employees
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        List<EmployeeModel> employees = employeeRepository.findAll();
        return ResponseEntity.ok(employees);
    }
}
