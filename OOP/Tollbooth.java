import java.util.Scanner;

public class Tollbooth {
	int totlnumbrcar;
  double  totalamont;
public void  Tollbooth() {
	totlnumbrcar=0;
	totalamont=0;
	
}
public void payingCar() {
	this.totlnumbrcar=totlnumbrcar++;
	this.totalamont=totalamont+0.50;	
	
}
public void noPayCar() {
	this.totlnumbrcar=totlnumbrcar++;
	
	
}
public void display() {
	 System.out.println("Total number of car : "+totlnumbrcar);
	 System.out.println("Total amount of car : "+totalamont);
	 
}
public static  void main(String arg[]) {
	Tollbooth obj=new Tollbooth();
          obj.Tollbooth();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter  number of car :");
	 int totlnumbrcar=sc.nextInt();

	 System.out.println("Enter  total amount :");
	  double  totalamont=sc.nextDouble();

	  System.out.println("choice for pay and nonpay and display:");
	 int s=sc.nextInt();
	
	 switch(s) {
case 1:
	 
		 
	obj.payingCar();
System.out.println("paying car counted ");

	 
break;
 case 2:
	obj.noPayCar();
System.out.println("non paying car counted");
break;
	 
default:
	obj.display();
		
	 }
	 }
	 

}
