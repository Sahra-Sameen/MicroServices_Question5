package com.Jpura.department.Repository;

import com.Jpura.department.Entity.DepartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DepartmentRepository extends JpaRepository<DepartmentModel, Long>{
}
