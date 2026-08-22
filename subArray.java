// import java.util.*;
public class subArray{
    public static void sub_Array(int number []){
        int totalSubArray = 0;
        for(int i= 0; i<number.length;i++){
            int start = i;
            for ( int j = i ; j<number.length ; j++){
                int end = j;
                for (int k = start ; k< end ; k++){
                    System.out.print(number[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total number of subArray :" +totalSubArray);
    }
    public static void main(String [] args){
        int number [] = {2,4,6,8,10,14};
        sub_Array(number);

    }
}