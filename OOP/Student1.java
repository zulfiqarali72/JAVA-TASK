import java.util.Scanner;
class Student1 { 
String firstname;
String lastname;
int contacts;
String city;
int DOB;
int currentsemster;
int nofcorse;
public void read(String firstname,String lastname,int contacts,String city,int DOB,int currentsemster,int nofcorse) {
	this.firstname= firstname;
	this.lastname=lastname;
	this.contacts=contacts;
    this.city=city;
	this.DOB=DOB;
	this.currentsemster=currentsemster;
	this.nofcorse=nofcorse;
}
public void print() {
	System.out.println("First name: "+firstname);
	System.out.println("Last name: "+lastname);	
	System.out.println("Contacts : "+contacts);
	System.out.println("city: "+city);
	System.out.println("Date of Birth: "+DOB);
	System.out.println("Current Semester : "+currentsemster);
	System.out.println("No of of Courses: "+nofcorse);

}
public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	Student1 obj=new Student1();
	System.out.println("First name: ");
	String firstname=sc.next();
	System.out.println("Last name: ");	
	String lastname=sc.next();
	System.out.println("Contacts : ");
	int contacts=sc.nextInt();
	System.out.println("city: ");
	String city=sc.next();
	System.out.println("Date of Birth: ");
	int DOB=sc.nextInt();
	System.out.println("Current Semester : ");
	int currentsemster=sc.nextInt();
	System.out.println("No of of Courses: ");
	int nofcorse=sc.nextInt();
	obj.read(firstname, lastname, contacts, city, DOB, currentsemster, nofcorse);
	obj.print();
	
	
}
}