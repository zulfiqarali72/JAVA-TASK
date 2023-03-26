import java.util.Scanner;
class Fractions{
	
	
public static void main(String arg[]) {
Scanner sc=new Scanner(System.in);
float  answer=0;
char res='y';
while( res!='n') {
System.out.print("Enter the first fraction a/b:");
int  a=sc.nextInt();
 int b=sc.nextInt();

 System.out.print("Enter the operator :");
char  op=sc.next().charAt(0);

System.out.print("Enter the second  fraction : c/d");
 int c=sc.nextInt();
 int d=sc.nextInt();
			    
switch(op) {
 case '+':
 System.out.print("ADDITION:");
float outa1=(a*d + b*c);
 float outa2=(b*d);
 answer=outa1/ outa2;
 break;

case'-':
 System.out.print("SUBTRACTION:");
float outs1= (a*d - b*c);
float outs2= (b*d);
answer=outs1/outs2;
 break;

case'*':
System.out.print("MULTIPLICTION:");
 float outm1= (a*c); 
float outm2=( b*d);
answer= outm1/ outm2;
 break;

case'/':
 System.out.print("DIVISION:");
 float outd1= (a*d);
float outd2=(b*c);
answer= outd1/ outd2;
break;

}
System.out.println(answer);
 System.out.println("Do another (y/n) :");
res =sc.next().charAt(0);}
 }
				
			
}