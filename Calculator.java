import java.util.*;
public class Calculator {
    public static void main(String[] main){
        System.out.println("Enter the first operand");
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        System.out.println("Enter the second operand");
        float b = s.nextFloat();
        System.out.println("Enter the operator");
        String op = s.next();
        switch(op){
            case"+":
            System.out.println("The sum of two number is"+(a+b));
            break;
            case"-":
            System.out.println("The sum of two numbers is"+(a-b));
            break;
            case"*":
            System.out.println("The product of two numbers is "+(a*b));
            break;
            case"/":
            System.out.println("The division of two numbers is "+(a/b));
            break;
            case"%":
            System.out.println("The remainder of the two numbers is"+(a%b));
            break;
            default:
            System.out.println("Enter a valid operator");
            
        }

    }
    
}
