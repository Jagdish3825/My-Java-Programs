import java.util.*;
public class Factorial {
public static void printFactorial(int n){
    if(n<0){
        System.out.println("Invalid input: Factorial is not defined for negative numbers.");
        return;
    }
    int factorial=1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;

    }
    System.out.println(factorial);
    return;
}  
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int n=sc.nextInt();
        printFactorial(n);
    }
}
