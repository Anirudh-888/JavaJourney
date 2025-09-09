public class Parameterised_Constructor {
    public Parameterised_Constructor(int a , int b){
        System.out.println("The sum using the constructor is "+(a+b));
    }
    public static void main(String[] args){
        //Giving the value to the constructor when we are calling a constructor
        Parameterised_Constructor pc = new Parameterised_Constructor(2,6);
        Parameterised_Constructor pc2 = new Parameterised_Constructor(89, 9);
    }
    
}
