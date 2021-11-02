# Demo-Project-1

This project is made for the general understanding of the spring boot implementation and usage.

## Project is divided in multiple parts:
1. <b>POJO (plain old java object):</b> This contains the class that is used as entries in the Database.
    So in this each field is a variable that is defined in this class. Same is used for Database reference.
   We create Database entries based on these. So ``@Entity`` is used over the class to set it as
   Database columns and name of database as the class. Similary ``@Id`` is used for primary key.
   
        {
           "name": "Pavan",
           "managerName": "Bhaskar",
           "designation": "SDE-2",
           "salary": 220000.0
        }

2. <b>Controller :</b> Controller has all the endpoints that are configured. Here we define all the endpoints
as per method, and accordingly required path, body ,etc.
   
    ### Important annotation:
    
    (a) ``@RestController`` : Set over the class to set as all the endpoints have REST calls.
    
    (b) ``@AutoWired`` : This is used for the connection between the class, and the object call. Similar on the 
    Class ``@Service`` annotation is used for annotating that the object belongs to that class.
    
    (c) ``@RequestMapping`` : This is used over the methods to set the path and method. Default method is ``GET``.
    
    (d) ``@PathVariable`` : Used in the endpoints where we use path parameter. The variable is defined by ``{variableName}``, and the same
    variable can be used directly in method. Else to use different variable name need to use ``("name")``.
    
        @RequestMapping(value = "/employee/{name}")
        public Optional<Employee> searchEmployee(@PathVariable("name") String namecalled )
        {
             return emp.getEmployee(namecalled);
        }
    
    (e) ``@RequestBody`` : This is used in the ``POST`` , ``PUT`` ,``DELETE`` methods call. Where we have to provide 
    body to the endpoint. 
    
        @RequestMapping(value = "/employee",method = RequestMethod.POST)
        public void addEmployee(@RequestBody Employee employeeToBeAdded )
        {
            emp.addEmployeeWithDetails(employeeToBeAdded);
        }
3. <b>Services :</b> This has class that uses the POJO and performs operations required by the controller or endpoints.
In this we could have all the logics through methods. We use the CRUD repository methods as well for getting Database operations.
   

4. <b>Interface of  ``CrudRepository``:</b> This Interface is used for the CRUD operations for the Database.


# Project Overview:

