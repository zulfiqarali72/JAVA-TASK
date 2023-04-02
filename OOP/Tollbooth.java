import java.util.Scanner;

public class Tollbooth {
	int totlnumbrcar;
  double  totalamont;
public void  Tollbooth() {
	this.totlnumbrcar=0;
	this.totalamont=0;
	
}
public void payingCar() {
	totlnumbrcar=totlnumbrcar++;
	totalamont=totalamont+0.50;	
	
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
         Scanner sc=new Scanner(System.in);

	  System.out.println("choice for pay and nonpay and display:");
	 char s=sc.next().charAt(0);
	
	 switch(s) {
case 'p':
	 
		 
	obj.payingCar();
System.out.println("paying car counted ");

	 
break;
 case 'n':
	obj.noPayCar();
System.out.println("non paying car counted");
break;
	 
default:
	obj.display();
		
	 }
	 }
	 

}
