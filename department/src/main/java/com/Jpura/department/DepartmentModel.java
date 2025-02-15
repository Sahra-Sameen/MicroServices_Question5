package com.Jpura.department;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "departments")
public class DepartmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depId;
    private String depName;
    private String depLocation;

    public DepartmentModel() {
    }

    public DepartmentModel(Long depId, String depName, String depLocation) {
        this.depId = depId;
        this.depName = depName;
        this.depLocation = depLocation;
    }

    public Long getDepId() {
        return depId;
    }

    public void setDepId(Long depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }
}
