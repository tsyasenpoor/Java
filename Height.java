import java.util.*;
public class Height {   
   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("input: ");
      final int height=scan.nextInt();
      int line,i,j;
      for(line=1;line<=height;line++) {
         for(i=1;i<=line-1;i++) 
            System.out.print("\\\\");
         for(j=1;j<=(-2)*line+(2*height)+1;j++)
            System.out.print("!!");
         for(i=1;i<=line-1;i++) 
            System.out.print("//");
         System.out.println();
      }
   }
}
 