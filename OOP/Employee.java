import java.util.Scanner;
class Employee {
	int emplnumber;
	float salary;
public void main(int emplnumber,float salary) {
this.emplnumber=emplnumber;
this.salary=salary;
}
public void display() {
System.out.println("Employee Number : "+this.emplnumber);
System.out.println("Employee Salary : "+this.salary);
	}
public static void main(String arg[]) {
Employee obj=new Employee();
Scanner sc=new Scanner(System.in);

for(int i=1;i<=3;i++) {
System.out.println("Enter the employeer number:");
int emplnumber=sc.nextInt();

System.out.println("Enter the salary: ");
float salary =sc.nextFloat();

obj.main(emplnumber,salary);
obj.display();
}}}