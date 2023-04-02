class CEO {
 String  name;
 int age;
 String companyName;
String contact;
String rank;

public  CEO(String name,int age,String companyName,String rank,String contact) {
	this.name=name;
	this.age=age;;
	this.companyName=companyName;
	this.contact=contact;
	this.rank= rank;
		
}
public void   DisplayInformation() {
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Company Name:"+companyName);
	System.out.println("Contact:"+contact);
	System.out.println("Rank:"+rank);
	System.out.println();
	
}
}



class Manager extends CEO {
	
String  name;
int age;
String companyName;
String  contact;
String rank;

public  Manager (String name,int age,String companyName,String rank,String contact) {
  super(name,age,companyName,rank,contact);
}

public void   DisplayInformation() {
super.DisplayInformation();
			
}
}


class AssistantManager extends CEO {
String  name;
int age;
String companyName;
String contact;
String rank;
public   AssistantManager(String name,int age,String companyName,String rank,String  contact) {
super(name,age,companyName,rank,contact);
}
	
public void   DisplayInformation() {
super.DisplayInformation();
}
}


class Supervisor extends CEO {
String  name;
int age;
String companyName;
String  contact;
String rank;
public   Supervisor(String name,int age,String companyName,String rank,String  contact) {
super(name,age,companyName,rank,contact);
}
	
public void   DisplayInformation() {
  super.DisplayInformation();
}
}


class Employees extends CEO {
String  name;
int age;
String companyName;
String  contact;
String rank;

public   Employees(String name,int age,String companyName,String rank,String  contact) {
  super(name,age,companyName,rank,contact);	
}
	
public void   DisplayInformation() {
  super.DisplayInformation();
}
}


 class Simple {
public static void main(String arg[]) {
	CEO obj=new CEO("Siraj",29,"apartcha","CEO","0349786288");
	obj.DisplayInformation();

	AssistantManager obj1=new AssistantManager("Imran",25,"apartcha","AssistantManager","0323786288");
	obj1.DisplayInformation();

	Manager obj2=new Manager("Ahmed",24,"apartcha","Manager","032216288");
	obj2.DisplayInformation();

	Supervisor obj3=new Supervisor("Imran",23,"apartcha","Supervisor","0323786288");
	obj3.DisplayInformation();

	Employees obj4=new Employees("Haider",22,"apartcha","Employees","0323786288");
	obj4.DisplayInformation();
	
	
	
	
	
}
}
