public class Varargs {
    public void Sum (int... numbers){
        int sum = 0;
        for(int i:numbers){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
     Varargs v = new Varargs();
     v.Sum(2,3,6,5,4);

    }}
    

