package com.restfulwebservices.restful.services;

import com.restfulwebservices.restful.exception.ResourceNotFoundException;
import com.restfulwebservices.restful.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> emp = new ArrayList<>();

    public EmployeeService() {
        emp.add(new Employee(1L, "Krish", 22));
        emp.add(new Employee(2L, "Sanyam", 27));
    }

    public List<Employee> getAllEmployees() {
        return emp;
    }

    public Employee getEmployeeById(Long id) {
        for (Employee e : emp) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        throw new ResourceNotFoundException("Employee not found with id: " + id);
    }

    public Employee addEmployee(Employee employee) {
        emp.add(employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        Employee rem = null;

        for (Employee e : emp) {
            if (e.getId().equals(id)) {
                rem = e;
                break;
            }
        }
        if (rem == null) {
            throw new ResourceNotFoundException("Employee not found with id: " + id);
        }

        emp.remove(rem);
    }

    public Employee updateEmployee(Long id, Employee updatedEmployee) {

        for (Employee e : emp) {

            if (e.getId().equals(id)) {
                e.setName(updatedEmployee.getName());
                e.setAge(updatedEmployee.getAge());
                return e;
            }
        }
        throw new ResourceNotFoundException("Employee not found with id: " + id);
    }

}
