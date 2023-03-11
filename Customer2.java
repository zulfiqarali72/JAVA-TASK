import java.util.Scanner;
public class Customer2 {
int id;
String name;
public void Customer2(int id,String name) {
 this.id=id;
 this.name=name;
}
public void getShow() {
		 
 System.out.println("Id :"+this.id);
 System.out.println("Name :"+this.name);
}
public static void main(String arg[]){
Customer2 c2=new Customer2();	
Scanner sc=new Scanner(System.in);
for(int i=1;i<=5;i++) { 
System.out.println("Enter the Id and Name:");
 int id=sc.nextInt();
String name=sc.nextLine();
 c2. Customer2(id, name);
 c2.getShow();}}}
 
			