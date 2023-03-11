import java.util.Scanner;
public class Customer1 {
int id;
String name;
public void getDeatils(int id,String name) {
 this.id=id;
 this.name=name;
}
public void getShow() {
		 
 System.out.println("Id :"+this.id);
 System.out.println("Name :"+this.name);
}
public static void main(String arg[]){
Customer1 c1=new Customer1();	
Scanner sc=new Scanner(System.in);
for(int i=1;i<=5;i++) { 
System.out.println("Enter the Id and Name:");
 int id=sc.nextInt();
String name=sc.nextLine();
 c1. getDeatils(id, name);
 c1.getShow();
}}}
 
			