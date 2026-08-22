// import java.util.*;
public class function{

//     public static int calculateSum(int num1, int num2){
//         int sum = num1 + num2;
//         return sum;
 
//     }
//    public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter first number:");
//     int a =  sc.nextInt();
//     System.out.println("enter second number:");
//     int b = sc.nextInt();
//     int sum = calculateSum(a,b);
//     System.out.println("Sum is : " +sum);
//   }


// swap numbers
    // public static void swap(int a , int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println("After swap a" +a+ "and b" +b);
    // }
    // public static void main(String[] args) {
    //     int a=24;
    //     int b= 42;
    //     // System.out.println("Before swap a" +a+ "and b" +b);
    //     swap(a,b);
    //     // System.out.println("After swap a" +a+ "and b" +b);
    // }


    // find products of a nad b
    public static int multiple(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    } 

    // find factorial
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f = f * i;

        }
        return f;
    }

    // find binomial coefficient
    public static int binCoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // Function Overloading
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b , int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter first number:");
        // int a= sc.nextInt();
        // System.out.println("enter second number:");
        // int b= sc.nextInt();
        // int mul = multiple(a,b);
        // System.out.println("multiple is :" +mul);


        // System.out.println(fact(4));

        //  System.out.println(binCoeff(4,2));

        System.out.println(sum(3,5));
        System.out.println(sum(3,4,6));

    }
}