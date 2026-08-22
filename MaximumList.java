import java.util.*;
public class MaximumList {
     public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1 ; i<=5 ; i++){
           int Element = i*1;
           list.add(Element);
           System.out.print(Element + " ");
        }

        System.out.println();

        // Maximum in an ArrayList

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<list.size() ; i++ ){
            max=Math.max(max,list.get(i));
        }
        System.out.println("Maximum ArrayList : " +max);
    }
}
