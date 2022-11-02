package com.example.mybatis.springbootmybatis.resource;

import com.example.mybatis.springbootmybatis.mapper.EmployeeMapper;
import com.example.mybatis.springbootmybatis.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/employee")
public class EmployeeResource {

    private EmployeeMapper employeeMapper;

    public EmployeeResource(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return employeeMapper.findAll();
    }

    @GetMapping("/update")
    private List<Employee> update() {
        Employee employee = new Employee();
        employee.setName("Dashrath");
        employee.setSalary(23500L);
        employeeMapper.insert(employee);
        return employeeMapper.findAll();
    }

}