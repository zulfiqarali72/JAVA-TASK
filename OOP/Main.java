import java.util.Scanner;

class Publication {
String title;
float price;
public void getdata() {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the title:");
 title=sc.next();
System.out.println("Enter the price:");
 price=sc.nextFloat();
		 
}
public void putdata() {
System.out.println(title);
System.out.println(price);
}
}


//import java.util.Scanner;
class Book extends Publication {
int pageCount;
public void getdata() {
Scanner sc=new Scanner(System.in);
super.getdata();
System.out.println("Enter the PageCount");
pageCount=sc.nextInt();
}

public void putdata() {
super.putdata();
System.out.println(pageCount);
}
}


//import java.util.Scanner;
class Tape extends Publication{
float time;
public void getdata() {
	
Scanner sc=new Scanner(System.in);
super.getdata();
System.out.println("Enter the time in min:");
time=sc.nextFloat();
}
public void putdata(){
super.putdata();
System.out.println(time); 
}
}



class Main {
public static void main(String arg[]) {
Book b=new Book();
System.out.println("Enter the book data");
b.getdata();
System.out.println("Display the book data");
b.putdata();

Tape t=new Tape();
System.out.println("Enter the Tape data");
t.getdata();
System.out.println("Display the Tape data");
b.putdata();

}
}
