import java.util.*;
public class MultiplicationTable {
    public static void main(String [] args){
        int n;
        System.out.println("Enter the number for which the tables is required");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter upto which the tables is requried");
        int a = sc.nextInt();
        for(int i =0;i<=a;i++){
            System.out.println(+(n)+"X"+(i)+"="+(n*i));
        }
    }
}
