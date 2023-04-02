import java.util.regex.*;    
import java.util.Scanner;
public class Bank1 {
String name;
int cnic;
String email;
String password;
int accnumber;
double balance;
boolean login=false;
	
Scanner sc=new Scanner (System.in);	
		
public void createAccount() 
{
System.out.println("Enter your name");
String name=sc.nextLine();

System.out.println("Enter your CNIC");
int cnic=sc.nextInt();

Pattern p = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
System.out.println("Enter your email");
String email=sc.nextLine();
if(!p.matcher(email).matches()) {
System.out.println("Invalid Pattern");
 return;}

System.out.println("Enter your Password");
String password=sc.nextLine();
System.out.println("Your Account has created successfully");
}
	     
public void login() {
			
System.out.println("Enter your name");
String name2=sc.nextLine();

System.out.println("Enter your CNIC");
int  cnic2=sc.nextInt();
 if(cnic2==cnic) {
				 
login=true;
}
 else {
System.out.println("Enter your CNIC correct");
login=false;
}
System.out.println("Enter your email");
String email2=sc.nextLine();

System.out.println("Enter your Password");
String password2=sc.nextLine();
if(password2==password) {
				 
 login=true;
}
else {login=false;
System.out.println("Enter your password correct");

 }}
 
public void depositCash() {
System.out.println("Enter the account Number");
int accnumber=sc.nextInt();
 try {
		         
int leng=Integer.toString(accnumber).length();
if (leng < 8) {
System.out.println("Account number length is at least 8.");
} else {
System.out.println("Account number " + accnumber + " is valid.");
System.out.println("Enter the amoount to deposit:");
 balance= balance+sc.nextLong();
}
} catch (NumberFormatException e) { 
 System.out.println(e.getMessage());
}
}

public void balanceInquiry() {
System.out.println("your Amount :+amount"+balance);
}

public void getProfile() {
System.out.println("NAME:"+name);
System.out.println("CNIC:"+cnic);
System.out.println("EMAIL:"+email);
System.out.println("BALANCE:"+balance);
}
	
public static void main(String arg[]) {
Scanner sc=new Scanner(System.in);
Bank1 b=new Bank1();
System.out.println("Welcome to Cash Deposit Machine");
System.out.println("Enter any choice");
int choice=sc.nextInt();
{
switch (choice) {
case 1:
b.createAccount();
case 2:
if(choice!=1){
System.out.println("Fist create account then login");
b.createAccount();}
else
{b.login();}
break;

case 3:
if(choice!=1&&choice!= 2) {
System.out.println("Fist create account and  login then deposit cash");
b.createAccount();
b.login();}
else
{b.depositCash();}
break;
case 4:
b.balanceInquiry();
break;
			
case 5:
b.getProfile();
break;
}}}
}