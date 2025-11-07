import java.util.*;
public class rev_num{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int n = s.nextInt();
        int q = 0;
        int r = 0;
        while(n!=0){
            r = n%10;
            n=n/10;
            System.out.print(r);
        }
    }
}