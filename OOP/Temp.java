import java.util.Scanner;
class Temp{ 
	public static void main(String arg[]) {
System.out.println("1 Convert celsuis to Fahrenheit ");
System.out.println("2 Convert  Fahrenheit to Fahrenheit  ");
Scanner sc=new Scanner(System.in);		
int a=sc.nextInt();

switch(a) {
case 1:
System.out.println("Enter the temprature in Fahrenheit: ");
float F=sc.nextFloat();
float Celsius= (F-32)*5/9;
System.out.println("In Celsius :"+Celsius);
break;
		
case 2:
System.out.println("Enter the temprature in  Celsius : ");
float C=sc.nextFloat();
float Fahrenheit = (C* 9/5) + 32;
System.out.println("In Fahrenheit :"+Fahrenheit); 
break;

}
}
}