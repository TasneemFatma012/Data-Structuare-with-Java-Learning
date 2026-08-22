import java.util.Scanner;
public class calculator{
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an operator :");
        char operator = sc.next().charAt(0);
        System.out.println("Enter a first number :");
        int n1 = sc.nextInt();
        System.out.println("Enter a second number :");
        int n2 = sc.nextInt();

        switch(operator){
            case '+':
                System.out.println("Sum is :" + (n1+n2));
                break;
            case '-':
                System.out.println("Sub is :" + (n1-n2));
                break;
            case '*':
                System.out.println("Mul is :" + (n1*n2));
                break;
            case '/':
                System.out.println("Div is :" + (n1/n2));
                break;
            default:
                System.out.println("Invalid");


        }
    }

}