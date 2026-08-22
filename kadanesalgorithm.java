public class kadanesalgorithm {
    public static void kadenes(int numbers[]){
        int ms = Integer.MIN_VALUE ;
        int cs= 0;
        for( int i =0 ; i<numbers.length ; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Max Subarray Sum :" +ms);
    }
    public static void main(String [] args){
        int numbers [] = {1,-2,6,-1,3};
        kadenes(numbers);

    }
}
