package com.hjwasim.model;

public class Employee {
    private Long id;
    private String name;
    private String designation;
    private Double salary;
    private Integer yoe;

    public Employee(Long id, String name, String designation, Double salary, Integer yoe) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.yoe = yoe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getYoe() {
        return yoe;
    }

    public void setYoe(Integer yoe) {
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", yoe=" + yoe +
                '}';
    }
}
