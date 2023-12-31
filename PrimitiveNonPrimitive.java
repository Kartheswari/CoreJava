// Primitive -  Non primitive

// Primitive data types -> boolean, char, byte, short, int, long, float and double

// Memory size for the primitive data types is fixed

// Default value 0 for int, false for boolean.... etc

// Non primitive data types Array, String, Class, Object, Long, Boolean

// Non-primitive types can be used to call methods

// Non-primitive types memory usage can vary depending on the size of the object

// Non-primitive default value is null for all objects

public class PrimitiveNonPrimitive
{
    public static void main(String[] args) 
    {
        System.out.println("main method");
        
        TeamMembers obj = new TeamMembers();
        System.out.println("floatData---->"+obj.floatData+"-----intData----->"+obj.intData+"----booleanData---->"+obj.booleanData);
        
        System.out.println("Non primitive-->"+obj.aBoolean);
    }
}

class Employee
{
    Employee() 
    {

    }
}

class TeamMembers extends Employee
{
    boolean booleanData;
    int intData;
    float floatData;

    Boolean aBoolean; //Non-primitive
  
    TeamMembers()
    {
        aBoolean = false;
        booleanData = true;
        intData = 1666;
        floatData = 1.5F;
        
        System.out.println("This is TeamMembers constructor ---->");
    }
}
