package Courses.services;

import Courses.pojo.Employee;
import Courses.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepo employeeRepo;
    private List<Employee> employeeList= new ArrayList(Collections.singleton(new Employee("ABC", "DEF", "Manager", 120000.0)));

    public List<Employee> addEmployee()
    {

        //Employee employee=new Employee("ABC","DEF", "Manager", 120000.0);
        Employee employee1=new Employee("ABC1","DEF", "Manager", 120000.0);
        Employee employee2=new Employee("ABC2","DEF", "Manager", 120000.0);
        //employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        return employeeList;
    }

    public List<Employee> allEmployee() {
        List<Employee> ls= new ArrayList<>();

         employeeRepo.findAll().forEach(ls::add);
         return ls;
//
//    return employeeList;
    }
    public Optional<Employee> getEmployee(String name)
    {
       return employeeRepo.findById(name);
//        return employeeList.stream().filter(t->t.getName().equals(name)).findFirst();
    }

    public void addEmployeeWithDetails(Employee employeeToBeAdded) {
        employeeRepo.save(employeeToBeAdded);
//        employeeList.add(employeeToBeAdded);
    }

    public void updateEmployeeWithDetails(Employee employeeToBeUpdated, String name) {
        employeeRepo.save(employeeToBeUpdated);
//        for(int i=0;i<employeeList.size();i++)
//        {
//            if(employeeList.get(i).getName().equals(name))
//            {
//                employeeList.set(i,employeeToBeUpdated);
//            }
//        }
    }
    public void deleteEmployee(Employee empl)
    {
        employeeRepo.delete(empl);
    }
   /**
    public static void main(String [] args)
    {
        EmployeeServices empl=new EmployeeServices();
        System.out.println(empl.employeeList.get(0));
    }
    */
}
