import java.util.* ;
class Q3 {
	public static void main(String[] args) {
		int a,b,c,n=1 , max=1 , m=-1;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		while(a!=-1){
			b=a;
			c=scan.nextInt();
			if(c==a)
			n++;
			else{
				if(n>=max){
					m=b;
					max=n;
					a=c;
					n=1; }
				}
			}
	}
}