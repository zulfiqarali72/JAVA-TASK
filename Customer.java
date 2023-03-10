import java.util.Scanner;
public class Customer{
 int id;
 String name;
 public void getDetails(int id,String name) {
this.id=id;
this.name=name;
	   
 }
 public void getShow() {
	 
 System.out.println("Id :"+this.id);
 System.out.println("Name :"+this.name);
}
    public static void main(String arg[]){
Customer c=new Customer();	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Id and Name:");
int id=sc.nextInt();
String name=sc.nextLine();
c.getDetails(id, name);
c.getShow(); 
	 
 }}
