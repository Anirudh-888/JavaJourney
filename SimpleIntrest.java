import java.util.*;
public class SimpleIntrest {
    public static void main(String [] args){
        System.out.println("Enter the principle amount");
        Scanner sc = new Scanner(System.in);
        float Pm = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        float rate = sc.nextFloat();
        System.out.println("Enter the time period in years");
        float years = sc.nextFloat();
        System.out.println("The intrest to be paid for the given time and for the given principal is:"+((Pm*years*rate)/(100)));
        System.out.println("The amount that has to be returned after the time is"+(Pm+(Pm*years*rate)/(100)));
    }
}
