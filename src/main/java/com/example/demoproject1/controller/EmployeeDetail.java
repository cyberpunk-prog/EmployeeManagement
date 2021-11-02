package com.example.demoproject1.controller;

import com.example.demoproject1.pojo.Employee;
import com.example.demoproject1.services.EmployeeServices;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeDetail {
    @Autowired
    private EmployeeServices emp;

    @RequestMapping(value = "/allEmployee",method = RequestMethod.GET)
    public List<Employee> employeeDetailOfAll(){

        return emp.allEmployee();
    }
//    @RequestMapping(value = "/addEmployee",method = RequestMethod.GET)
//    public List<Employee> addEmployeeDetailOfAll(){
//
//        return emp.addEmployee();
//    }

    @RequestMapping(value = "/employee/{name}")
    public Optional<Employee> searchEmployee(@PathVariable("name") String namecalled )
    {
        return emp.getEmployee(namecalled);
    }
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employeeToBeAdded )
    {
        emp.addEmployeeWithDetails(employeeToBeAdded);
    }

    @RequestMapping(value = "/employee/{name}",method = RequestMethod.PUT)
    public String updateEmployee(@RequestBody Employee employeeToBeUpdated , @PathVariable String name)
    {
        emp.updateEmployeeWithDetails(employeeToBeUpdated,name);
        return "Updated Successfully";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.DELETE)
    public String deleteEmployee(@RequestBody Employee employeeToBeDeleted )
    {
        emp.deleteEmployee(employeeToBeDeleted);
        return "Deleted employee";
    }
}
