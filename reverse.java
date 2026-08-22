public class reverse {
    public static void ReverseNumber(int number []){
        int first = 0;
        int last = number.length - 1;
        if(first<last){
            int temp = number[first];
            number[first] = number[last] ;
            number[last]= temp;
            first++;
            last--;
        }
    }
    public static void main (String [] args){
        int number [] = {10,20,30,40,50};
        ReverseNumber(number); 
        for(int i = 0 ; i< number.length ; i++){
            System.out.println(number[i] + " ");
        }
        System.out.println();
    }
}
