import java.util.*;
public class FunctionMultiplication {
 public static int CalculateProduct(int a , int b){
 
     int Product=a*b;
     return Product;
 }
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the First Number:");
    int a=sc.nextInt();
    System.out.println("Enter the Second Number:");
    int b=sc.nextInt();
    int Product=CalculateProduct(a,b);
    System.out.println("The Product is: " + Product);
 }

}