public class Md_Array {
    public static void main(String[] args){
    //declaring a multidimensional array
    int [] [] array = {{1,2,3,4,5,6},{1,2,3,4,5,6}};
    //This is to traverse the elements of the multidimensional array
    for(int i = 0; i<array.length;i++){
        for(int j = 0;j<array[i].length;j++){
            System.out.println(array[i][j]);
        }
    }
    //This is to access the array elements by the index of the array
    System.out.println(arrray[0][1]);
    }
    
}
