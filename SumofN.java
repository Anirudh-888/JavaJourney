import java.util.*;
public class SumofN {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number upto which the sum is required");
        int n = s.nextInt();
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+i;
        }
        System.out.println("The sum of natural numbers upto "+(n)+"is"+(sum));
    }
}
