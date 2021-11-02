package Courses.repo;

import Courses.pojo.Employee;
import org.springframework.data.repository.CrudRepository;
//all the CRUD operations are already there by CrudRepository

public interface EmployeeRepo extends CrudRepository<Employee,String> {

}
