package com.Practise.Service;

import com.Practise.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public void saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(String id);
    void updateEmployee(Employee employee);
    String deleteEmployee(String id);
}
