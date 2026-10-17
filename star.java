import java.util.*;
public class star {
    public static void main(String[]args)
    {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter thr length of the rectangle : ");
                int l = sc.nextInt();
                System.out.println("Enter the breadth of the rectangle : ");
                int b = sc.nextInt();
                for(int i=1;i<=b;i++)
                  {
                    for(int j=1;j<=l;j++)
                    {
                      if(i==1||j==1||i==b||j==l)
                      {
                         System.out.print("* ");
                      }
                      else{
                         System.out.print("  ");
                      }
                    }
        
                System.out.println();

    }
            sc.close();
        }

}

