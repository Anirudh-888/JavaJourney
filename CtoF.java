import java.util.*;
public class CtoF {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the temperature in celcius scale");
      float cel = sc.nextFloat();
      //here if we give 9/5 it will take it as int and give the value as int and it will make it 0 but if we give it 9.0/5.0,
      //then we are getting the same data type so it is correct
      System.out.println("The corresponding celcuis in fahrenheit is"+((cel)*(9.0/5.0)+32));
      System.out.println("Enter the reading in fahrenheit");
      float fahr = sc.nextFloat();
      System.out.println("The corresponding reading in celcius is"+((fahr-32)*(5.0/9.0)));
      sc.close();

      /*NOTES for this code 
        1. Any default number will be taken as the double value but if we try to perform any calculation the default value is double we have to convert it
        
       */

    }
}
