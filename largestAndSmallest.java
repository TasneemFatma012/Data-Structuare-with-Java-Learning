public class largestAndSmallest {
    public static int largest_And_Smallest_Number(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i< number.length ;i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("smallest number is :" +smallest);
        return largest;
    }
    public static void main(String [] args){
        int number [] = {10,20,30,43,23,3};
        System.out.println("largest number is :" +largest_And_Smallest_Number(number));

    }
}
