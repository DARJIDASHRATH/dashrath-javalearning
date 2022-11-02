package com.example.mybatis.springbootmybatis.Resource;

import com.example.mybatis.springbootmybatis.mapper.EmployeeMapper;
import com.example.mybatis.springbootmybatis.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    private EmployeeMapper usersMapper;

    public UsersResource(EmployeeMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @GetMapping("/all")
    public List<Employee> getAll() {
        return usersMapper.findAll();
    }

    @GetMapping("/update")
    private List<Employee> update() {
        Employee users = new Employee();
        users.setName("Dashrath");
        users.setSalary(23500L);
        usersMapper.insert(users);
        return usersMapper.findAll();
    }

}