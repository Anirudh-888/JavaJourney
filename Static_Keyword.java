public class Static_Keyword {
    //This is static variable.
    //The keyword static is used su that these can be called without creating an instance of the class
    //These static variables can be accessed using the class name itself
    static int a = 1;
    //This is creation of static method. This method also can be called using the class name
    static void method(){
        System.out.println("This is a static method");
    }
    //This is the static initializer executed when the class is loaded
    //This is mostly used it initialize the static variables
    static {
        System.out.println("This is from the static initializer");
    }
    public static void main(String[] args){
        //Accesing the static variable through the class name
        System.out.println(Static_Keyword.a);
        Static_Keyword.method();
    }
}
