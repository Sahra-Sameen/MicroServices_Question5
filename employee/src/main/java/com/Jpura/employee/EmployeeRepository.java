package com.Jpura.employee;

import com.Jpura.employee.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{
}
