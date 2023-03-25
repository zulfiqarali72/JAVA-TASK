import java.util.Scanner;
class Calculator {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
float  answer=0;
		char res='y';
	while( res!='n') {
	 
		System.out.print("Enter the number,Operator and Second Number: ");
		 int num1=sc.nextInt();
		char  op=sc.next().charAt(0);
		int num2=sc.nextInt();
		
		 switch(op) {
		 case '+':
			 answer=num1+num2;
			 break;
		 case'-':
			 answer=num1-num2;
			 break;
		 case'*':
			 answer=num1*num2;
			 break;
		 case'/':
			 answer=num1/num2;
			 break;
			 }
		 System.out.println("Answer ="+ answer);
		 System.out.println("Do another (y/n) :");
			 res =sc.next().charAt(0);}
	  }
		
	}

