public class Constructor {
    int x;
    // there is no need to specify the return type of the function for the constructor as it is always void
    public Constructor(){
     x=10;
    }
    public static void main(String[] args){
        Constructor o = new Constructor();
        System.out.println(o.x);
        
    }
    
}
