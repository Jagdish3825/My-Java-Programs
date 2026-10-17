import java.util.*;
public class FunctionAddition {
    public static int CalculateSum(int a,int b){
      int Sum = a+b;
        return Sum;
    }
    
      public static void main(String[]args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            int sum = CalculateSum(num1, num2);
            System.out.println("The sum is: " + sum);
        }
    
}
