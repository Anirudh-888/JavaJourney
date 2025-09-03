public class Abstraction {
    static abstract class Animal{
        //This is a abstract class 
        //In abstract class class cannot be created and the class has to be inherited to use. 
        //Below is the abstract function
        //Abstract functions cannot have a body they should be inherited and defined in the inherited class
        public abstract void AnimalSound();
        //This is a normal function that is declared in the abstract class
        public void sleep(){
            System.out.println("Zzzzz Zzzzzz");
        }
    }
    static class Cat extends Animal{
        public void AnimalSound(){
            System.out.println("Meow 🐈");
        }

    }
    public static void main(String[] args){
        Cat c = new Cat();
        c.AnimalSound();
        //This sleep function is not declared in the Cat class but due to abstraction it is being able to used by the Cat object
        c.sleep();

    }
    
}
