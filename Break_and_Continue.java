public class Break_and_Continue {
    public static void main(String[] args){
        for(int i = 0;i<10;i++){
            if(i==4){
                break;
            }
            //This will not print the value after 3 as we have given if i = 4 break so this will come out of the loop
            System.out.println(i);
        }
        for (int j = 0;j<10;j++){
            if(j==4){
                continue;
            }
            //this will skip the number 4 and then print till 10
            System.out.println(j);
            
            /*Output for the break loop is 0
             * 1
             * 2
             * 3
             * Output for the continue loop is 
             * 0
             * 1
             * 2
             * 3
             * 5
             * 6
             * 7
             * 8
             * 9
             */
        }
    }
    
}
