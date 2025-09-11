public class Enum_concpet {
    enum Levels{
        //Always the variables declared inside the enum should start with a capital case
        LOW,
        MID,
        HIGH
    }
    public static void main(String[] args){
        //This is the syntax for accesing the constant values that were declared in the Levels enum
        Levels Var = Levels.HIGH;
        Levels Var2 = Levels.LOW;
        Levels Var3 = Levels.MID;
        System.out.println((Var));
        System.out.println((Var2));
        System.out.println((Var3));
    }
    
}
