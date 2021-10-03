import jdk.internal.reflect.ReflectionFactory.GetReflectionFactoryAction;

/**
 * Hello - This is my first Java Program
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    // primitive types
    byte myByte=20;
    int myInt=8452644;
    float myFloat=12.26f;
    double myDouble=54.12345678910111213;
    char myChar='b';
    boolean myBool=true;
    // non primitive types
    String myName=new String("Charlie");
    String firstName="Charlie";
    System.out.println(myName.toUpperCase());
    greet();
    }
    public static void greet() {
        System.err.println("Hello Charlie!");
        
    }
    
}