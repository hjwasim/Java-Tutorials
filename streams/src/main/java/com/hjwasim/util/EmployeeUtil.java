package com.hjwasim.util;

import com.hjwasim.model.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = Arrays.asList(
                new Employee(101L, "Hjwasim", "Senior Software Engineer", 95000.50, 7),
                new Employee(102L, "Waz", "Backend Developer", 82000.00, 4),
                new Employee(103L, "YP", "QA Engineer", 68000.75, 3),
                new Employee(104L, "Saas", "Tech Lead", 165000.0, 10),
                new Employee(105L, "Ele", "DevOps Engineer", 90000.00, 6)
        );
        System.out.println("Total Employee retrieved : " + employeeList.size());
        return employeeList;
    }
}
