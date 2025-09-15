public class Inheritance_Types {
    //Single inheritance 
    //In this type of inheritance
    public static class Car{
        public void car(){
            System.out.println("This is a car");
        }
    }
    public static class Audi extends Car{
        public void audi(){
            System.out.println("This is car from Audi");
        }
    }
    public static void main(String[] args){
        Audi a = new Audi();
        a.audi();
        a.car();

    }
}
