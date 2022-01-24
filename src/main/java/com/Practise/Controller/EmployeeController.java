package com.Practise.Controller;

import com.Practise.Model.Employee;
import com.Practise.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/save")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        System.out.println("Inside Save method");
        System.out.println(employee.toString());
        employeeServiceImpl.saveEmployee(employee);
        return employee;
        //return "Employee Added with Id: "+ employee.getId();
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        System.out.println("Inside Get method");
        return employeeServiceImpl.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id){
        return employeeServiceImpl.getEmployeeById(id);
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee){
        employeeServiceImpl.updateEmployee(employee);
        return "Employee Record Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable String id){
      return employeeServiceImpl.deleteEmployee(id);

    }

    /*    @PostMapping("/save")
    public ResponseDTO saveEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO){
        System.out.println("Inside save method");
        System.out.println(employeeRequestDTO);
       return employeeService.saveEmployee(employeeRequestDTO);
    }*/

}
