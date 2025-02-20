package com.Jpura.department.Controllers;

import com.Jpura.department.Repository.DepartmentRepository;
import com.Jpura.department.Entity.DepartmentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Create Department
    @PostMapping("/addDepartment")
    public ResponseEntity<DepartmentModel> saveDepartment(@RequestBody DepartmentModel departmentModel) {
        // Directly save and return DepartmentModel
        DepartmentModel savedDepartment = departmentRepository.save(departmentModel);
        return ResponseEntity.ok(savedDepartment);
    }

    // Get Department by ID
    @GetMapping("/{id}")
    public ResponseEntity<DepartmentModel> getDepartmentById(@PathVariable Long id) {
        DepartmentModel departmentModel = departmentRepository.findById(id).orElse(null);
        if (departmentModel == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(departmentModel);
    }

    // Get All Departments
    @GetMapping("/getAll")
    public ResponseEntity<List<DepartmentModel>> getAllDepartments() {
        List<DepartmentModel> departmentModels = departmentRepository.findAll();
        return ResponseEntity.ok(departmentModels);
    }
}
