import java.util.*;
public class Str 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		java.lang.String a =scan.nextLine();
		int k=0;
		int s=0;
		
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)== 'i')
				k++;
			if(a.charAt(i)==' ')
				s++;
		}
		System.out.println("tedade horoof:"+(a.length()-s));
		System.out.println("nesbate horoof seda dar be kole horoof:"+ k*1.0/(a.length()-s));
		
	}
}
