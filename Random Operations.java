import java.util.*;
public class q4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int a,b,c,d,e,f,w=0;
		boolean value=true;
		while(w<3){
			value=true;
			a=rand.nextInt(100);
			b=rand.nextInt(100);
			c=rand.nextInt(4);
			f=rand.nextInt(3);
			//c=0 ----> +
			if(c==0) {
				System.out.println(a+" + "+b+" = ");
				d=scan.nextInt();
				e=a+b;
				if(e!=d) {
					w++;
					value=false;
				}
			}
			//c=1 ----> -
			else if(c==1) {
				System.out.println(a+" - "+b+" = ");
				d=scan.nextInt();
				e=a-b;
				if(e!=d) {
					w++;
					value=false;
				}
			}
			//c=2 ----> *
			else if(c==2) {
				System.out.println(a+" * "+b+" = ");
				d=scan.nextInt();
				e=a*b;
				if(e!=d) {
					w++;
					value=false;
				}
			}
			//c=3 ----> /
			else {
				System.out.println(a+" % "+b+" = ");
				d=scan.nextInt();
				e=a%b;
				if(e!=d) {
					w++;
					value=false;
				}	
			}
			if(value) {
				if(f==0)
					System.out.println("excellent :)");
				if(f==1)
					System.out.println("perfect :)");	
				if(f==2)
					System.out.println("nice job :)");
			}
			else {
				if(f==0)
					System.out.println("oops :(");
				if(f==1)
					System.out.println("be careful :(");
				if(f==0)
					System.out.println("try more :(");
			}
		}
	}
}
