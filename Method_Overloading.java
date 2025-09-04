public class Method_Overloading {
    public void Additon(int a, int b){
        System.out.println("The addition of two integers "+(a+b));
    }
    public void Addition(double c, double d){
        System.out.println("The additon of two double numbers"+(c+d));
    }
    public static void main(String[] args){
        Method_Overloading m = new Method_Overloading();
        //This is method overlaoding using the same function for adding the sum of different data type
        m.Additon(3,2);
        m.Addition(3.1415,3.2365);
    }
    
}
