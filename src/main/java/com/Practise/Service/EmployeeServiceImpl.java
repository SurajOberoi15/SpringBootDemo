package com.Practise.Service;

import com.Practise.Model.Employee;
import com.Practise.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
 /*   @Autowired
    ResponseDTO responseDTO;*/


    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees(){
      return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }


    @Override
    public String deleteEmployee(String id) {
        boolean temp_id = employeeRepository.findById(id).isPresent();
        if(temp_id){
            employeeRepository.deleteById(id);
            return "Employee Record Deleted";
        }
        else{
            return "Employee Record Not Found";
        }

    }

    // Saving an employee
    /*public ResponseDTO saveEmployee(EmployeeRequestDTO employeeRequestDTO) {
        System.out.println("Inside Service-save method");
        System.out.println(employeeRequestDTO);
        responseDTO.setMessage("Request failed");
        responseDTO.setStatus("False");

        if(!Objects.nonNull(employeeRequestDTO.getId())){
            System.out.println("inside Service-save IF");
        }else{

           System.out.println("Inside Service-save else");
           Employee employee = new Employee();
           employee.setId(employeeRequestDTO.getId());
           employee.setFirstName(employeeRequestDTO.getFirstName());
           employee.setLastName(employeeRequestDTO.getLastName());
           employee.setDept(employeeRequestDTO.getDept());
           employee.setEmail(employeeRequestDTO.getEmail());
           employee.setPassword(employeeRequestDTO.getPassword());
           System.out.println("Checking Employee Object");
           System.out.println(employee);
           employeeRepository.save(employee);
           return responseDTO.toResponseEntity(employeeRequestDTO);
        }
        return responseDTO;
    }*/

}
