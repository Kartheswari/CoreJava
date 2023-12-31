// Encapsulation Concept

// A way to restrict the direct access to some components of an object

// To access the restrict methods, we can use getters and setters

// long currentTime = System.currentTimeMillis(); // Accessing system time using a method
// String osName = System.getProperty("os.name"); // Accessing system properties using a method

// The java.lang.System class encapsulates various system-related functionalities like input/output streams, environment variables, system properties, etc. 

// It encapsulates these functionalities and provides methods to access and interact with them.

public class Encapsulation
{
    public static void main(String[] args) {
        System.out.println("main method");
        Employee obj = new Employee("HR2");
        
        obj.setEmployeeId("18880");

        System.out.println("getEmployeeId---->"+obj.getEmployeeId());
    }
}

class Employee
{
    private String employeeId;
    String employeeRole;
    private String name;
    
    public String getEmployeeId() 
    {
        return employeeId;
    }
    
    Employee(String empRole)
    {
        employeeRole = empRole;
    }
    
    public void setEmployeeId(String empId) 
    {
        if(hasPermission(employeeRole))
        {
            this.employeeId = empId;
        }
        else
        {
            System.out.println("You don't have permission");
        }
    }
    
    private boolean hasPermission(String empRole)
    {
        return empRole.equals("HR002");
    }

}
