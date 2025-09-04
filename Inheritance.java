public class Inheritance {
    public static class Vehicle{
        public void vehicle(){
            System.out.println("I am a vehicle");
        }
    }
    static class FourWheeler extends Vehicle{
        public void fourWheeler(){
            System.out.println("I have four wheels");
        }
    }
    static class Car extends FourWheeler{
        public void car(){
            System.out.println("I am a car");
        }
    }
    public static void main(String[] args){
        Car Jimmy = new Car();
        Jimmy.car();
        Jimmy.fourWheeler();
        Jimmy.vehicle();
    }
    
}
