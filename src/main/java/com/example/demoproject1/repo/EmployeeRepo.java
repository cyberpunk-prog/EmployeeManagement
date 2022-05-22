package com.example.demoproject1.repo;

import com.example.demoproject1.pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//all the CRUD operations are already there by CrudRepository

public interface  EmployeeRepo extends JpaRepository<Employee,String> {

}
