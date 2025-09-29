import java.util.*;
public class Leapyear {
    public static void main(String [] args){
        System.out.println("Enter the year to check whether it is a leap year or not");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("The year"+(year)+"is a leap year");
        }
        else{
            System.out.println("The year"+(year)+"is not a leap year");
        }
    }
}
