// Interface Concepts

// Since Java 8, we can have default and static methods in an interface.

// Datamembers by default -> public, static and final 

// Constructor not allowed in interface

// Constructors are used to initialize instances of a class, but interfaces do not have instances, so there's no need for constructors in interfaces.

// Interface supports multiple inheritance but class not supported.

// Multiple inheritance is not supported in class because of ambiguity but in interface implementation is provided by the implementation class.

public class InterfaceConcept
{
    public static void main(String[] args) {
        System.out.println("main method");
        
        TeamMembers obj = new TeamMembers();
        obj.empId();
    }
}

interface Company 
{
    abstract void companyName();
}

interface Employee{

    int empId = 1666;
//    Employee()
//    {
    
//    }

    abstract void name();

    abstract void empId();
    
    //abstract void mobileNumber();
    
    static void isEligibleForMeternityLeave(String gender) 
    {
        System.out.println("isEligibleMeternityLeave  ---->");
    }
    
    default void annualLeaveDays()
    {
        System.out.println("annualLeaveDays  ---->");
    }
}

class TeamMembers implements Employee,Company
{
    TeamMembers()
    {
        System.out.println("This is TeamMembers constructor ---->");
    }
    
    public void name ()
    {
        System.out.println("Namee  ---->");
    }
    
    public void empId()
    {
        System.out.println("empId  ---->"+empId);
    }

    @Override
    public void companyName() 
    {
        System.out.println("companyName  ---->");
    }
}
