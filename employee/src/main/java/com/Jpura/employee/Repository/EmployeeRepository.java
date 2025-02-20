package com.Jpura.employee.Repository;

import com.Jpura.employee.Entity.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{
}
