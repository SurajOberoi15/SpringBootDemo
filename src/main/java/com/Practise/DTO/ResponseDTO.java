/*
package com.Practise.DTO;

import org.springframework.stereotype.Component;

@Component
public class ResponseDTO {
   private String message;
   private String status;
   private String id;
   private String firstName;
   private String lastName;

    public ResponseDTO() {
    }

    public ResponseDTO(String message, String status, String id, String firstName, String lastName) {
        this.message = message;
        this.status = status;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ResponseDTO toResponseEntity(EmployeeRequestDTO employeeRequestDTO){
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setId(employeeRequestDTO.getId());
        responseDTO.setFirstName(employeeRequestDTO.getFirstName());
        responseDTO.setLastName(employeeRequestDTO.getLastName());
        responseDTO.setMessage("Employee object created successfully");
        responseDTO.setStatus("true");
        return responseDTO;
    }
}
*/
