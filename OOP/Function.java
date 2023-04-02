import java.util.Scanner;
class Function {
int s=1;
public double functionpower(double n,int p) {
return	n*n;
}
public int functionpower(int n,int p) {
for(int i=1;i<=p;i++) {
 s*=n;
}
return s;
}
public int functionpower(int n) {
return n*n;
}
public static  void main(String arg[]) {
Function obj= new Function();
Scanner sc=new Scanner(System.in);
		
System.out.println("Enter th n");
int n=sc.nextInt();
		 
System.out.println("Enter th p");
 int p=sc.nextInt();
		 
 System.out.println(obj.functionpower(n,p));
System.out.println(obj.functionpower(n,p));
System.out.println(obj.functionpower(n));
}
}