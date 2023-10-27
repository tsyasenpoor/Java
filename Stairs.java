import java.util.*;
public class Pp4 {
   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("How many stairs?");
      int stairs=scan.nextInt();
      for(int i=1;i<=stairs;i++){
         for(int j=stairs;j>=i+1;j--)
            System.out.print("     ");
         Adamak(i,stairs);}
         for(int k=1;k<=5*stairs+7;k++)
            System.out.print("*");
      
   }
   public static void Adamak(int x,int y){
      int i,j;
      System.out.print("  o  ******");
      for(i=1;i<=x-1;i++)
         System.out.print("     ");
      System.out.println("*");
      for(j=y;j>=i+1;j--)
         System.out.print("     ");
      System.out.print(" /|\\ *");
      for(i=1;i<=x;i++)
         System.out.print("     ");
      System.out.println("*");
      for(j=y+1;j>=i+1;j--)
         System.out.print("     ");
      System.out.print(" / \\ *");
      for(i=1;i<=x;i++)
         System.out.print("     ");
      System.out.println("*");
   }
}

      
         
      