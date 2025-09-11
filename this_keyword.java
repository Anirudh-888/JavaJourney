public class this_keyword {
    public class Person{
        private String name;
        private int age;
    
    public void getname(String Name, int Age){
        this.name = Name;
        this.age = Age;
    }
    public String Output(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
    public static void main(String[] args){
        //To create an object of the inner class we need to include the outer class and then the inner class and this is the syntax for it
        Person p = new this_keyword().new Person();
        p.getname("Anirudh", 20);
        System.out.println("Name: " + p.Output());
        System.out.println("Age: " + p.getAge());
    }
}
