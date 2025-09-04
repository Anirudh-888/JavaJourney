public class Method_Overloading2 {
    public void  Area(int s){
        System.out.println("The area of the square is "+(s*s));
    }
    public void Area(double l,double b){
        System.out.println("The area of the rectangle is "+(l*b));
    }
    public void Area(float  b, float h){
        System.out.println("The area of the triangle is "+(0.5*b*h));
    }
    public static void main(String[] args){
        Method_Overloading2 m2 = new Method_Overloading2();
        m2.Area(2);
        m2.Area(5.6, 6.3);
        m2.Area(3.14, 3.15);
    }
}
