class Student {

String Name;
int Age;
public 	static int Id; 
public void Display(String Name,int Age) {
    System.out.print("Name:");
    System.out.println(this.Name=Name);
   System.out.print("Age:");
   System.out.println(this.Age=Age);

}
     public static void main(String arg[]) {
	   Student s1=new Student();
	 int Id1=Student.Id=1001;
	 System.out.println("ID: "+Id1);
	s1.Display("Ali",21);

	Student s2=new Student();
	int Id2=Student.Id=1002;
	System.out.println("ID: "+Id2);
	s1.Display("Ahmed",24);

	Student s3=new Student();
	int Id3=Student.Id=1003;
	System.out.println("ID: "+Id3);
	s1.Display("Zain",20);

	Student s4=new Student();
	int Id4=Student.Id=1004;
	System.out.println("ID :"+Id4);
	s1.Display("Haider",22);

	Student s5=new Student();
	int Id5=Student.Id=1005;
	System.out.println("ID :"+Id5);
	s1.Display("Tom",23);
}

}
