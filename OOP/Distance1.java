import java.util.Scanner;
class Distance1 {
public static void main(String arg[]) {
	 Distance1 obj=new  Distance1();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the distance :");
	 int dis=sc.nextInt();
	 System.out.println("Enter the choice  :");
	
	 String  uni=sc.next();
	 System.out.println("Conversion of units:");
	int con=sc.nextInt();
 if(uni.equals("in")) {
 switch(con)
{
case 1:
	System.out.println("Inches to mm: "+dis*25.4);
break;
case 2:
	 System.out.println("Inches to km: "+dis*0.0000254);
break;
}}

else  if(uni.equals("mm")) {
	
switch(con)
{
		
case 1:
	System.out.println("mm to inches: "+dis*0.039);
break;
case 2:
	 System.out.println("mm to km: "+dis/1000000);
 break;
}}

else  if(uni.equals("km")) {
		 
switch(con)
{
case 1:
	 System.out.println("km to inches: "+dis*39370.1);
		
break;
case 2:
 System.out.println("km to mm: "+dis*1000000);
 break;
}}
	
}
}
