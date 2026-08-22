public class binarySearch {
    public static int binary_Search(int number[], int key){
        int start = 0;
        int end = number.length - 1 ;
        while(start <= end) {
            int mid = ( start + end ) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key) {
                start = mid + 1 ;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String [] args){
        int number [] = {10,20,30,40,50};
        int key=50;
        System.out.println("Index for key is :" +binary_Search(number,key));
    }
}
