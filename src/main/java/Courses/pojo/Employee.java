package Courses.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    private String name;
    private String managerName;
    private String designation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDesignation() {
        return designation;
    }

    public Employee() {
    }

    public Employee(String name, String managerName, String designation, double salary) {
        this.name = name;
        this.managerName = managerName;
        this.designation = designation;
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", managerName='" + managerName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

}
