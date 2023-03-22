package com.example.demo.model;
import java.util.Objects;

import jakarta.persistence.*;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstName;
	private String lastName;
	private String role;
	private Double salary;
  
    
    public Employee(String name, String last, String rol, double salary) {
        this.firstName = name;
        this.lastName = name;
        this.role = rol;
        this.salary = salary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getRole(){
        return role;
    }

    public Double getSalary(){
        return salary;
    }

    public void setEmployeeId(Long employeeId){
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setRole(String role){
        this.role = role;
    }
    
    public void setSalary(Double salary){
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", role="
                + role + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    result = prime * result + ((role == null) ? 0 : role.hashCode());
    result = prime * result + ((salary == null) ? 0 : salary.hashCode());
    return result; 
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true; 
        if (!(obj instanceof Employee)) return false;  
            Employee employee = (Employee) obj;  
                return Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName) && Objects.equals(role, employee.role)
                && Objects.equals(salary, employee.salary);
}
}