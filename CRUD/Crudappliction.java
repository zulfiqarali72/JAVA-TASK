import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class  Crudappliction {
	
	Scanner sc=new Scanner(System.in);
	List<Student0> students=new ArrayList<>();
	boolean Found = false;
	public void Add() {
		System.out.println("Enter the Student ID:");
	int id=sc.nextInt();
	System.out.println("Enter the Student Name:");
	String name=sc.next();
	System.out.println("Enter the Student Age:");
	int age=sc.nextInt();
	System.out.println("Enter the Student Rollnumber:");
	String rollNumber=sc.next();
	System.out.println("Enter the Student Email:");
	String email=sc.next();
	Student0 student = new Student0();
     student.setId(id);
     student.setName(name);
     student.setAge(age);
     student.setRollNumber(rollNumber);
     student.setEmail(email);

     students.add(student);
     System.out.println("Student Added");}
	public void Update() {System.out.println("Enter the Student ID:");
	int upid=sc.nextInt();
  
	ListIterator<Student0> ltr=students.listIterator(); 
	while(ltr.hasNext())
	{Student0 s=ltr.next();
	if(s.getId()==upid) {
		System.out.println("Enter the Student New ID:");
		 int id1=sc.nextInt();
		System.out.println("Enter the Student Name:");
		String name1=sc.next();
		System.out.println("Enter the Student Age:");
	    int age1=sc.nextInt();
		System.out.println("Enter the Student Rollnumber:");
		String rollNumber1=sc.next();
		System.out.println("Enter the Student Email:");
		String email1=sc.next();
		    s.setId(id1);
	        s.setName(name1);
	        s.setAge(age1);
	        s.setRollNumber(rollNumber1);
	        s.setEmail(email1);
	        Found = true;
	        System.out.println("Student Detail updated");
	break;}
	}
	
		System.out.println(" Student ID not Exit");
	}
	
	public void Delete() {
		System.out.println("Enter the Student ID:");
	int delid=sc.nextInt();
	Iterator<Student0> iterator=students.iterator();
	
	while(iterator.hasNext())
	{Student0 s=iterator.next();
	if(s.getId()==delid){
		iterator.remove();
		Found = true;
		System.out.println("Student ID Delete");
	break;}
	}
	 if (!Found) {
         System.out.println("Student ID does not exist");
     }
	}
	
	public void getStudent() {	
		System.out.println("Enter the Student ID:");
	int retid=sc.nextInt();
	for (Student0 s: students) {
	if(s.getId()==(retid)) {
		System.out.println("Id"+s.getId()+"Name"+s.getName()+"age"+s.getAge()+"RollNumber"+s.getRollNumber()+"Email"+s.getEmail());
		Found = true;
        break;}
	}
	
	}
	
	public void  allStudent()
	{Iterator<Student0>iterator=iterator=students.iterator();
        if (students.isEmpty()) {
            System.out.println("No students found");}
        else {while(iterator.hasNext())
	{Student0 s=iterator.next();
	System.out.println("Id"+s.getId()+"Name"+s.getName()+"age"+s.getAge()+"RollNumber"+s.getRollNumber()+"Email"+s.getEmail());
	}}}
	public void Exit()
	{
		
		Found=false;}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Crudappliction ob=new Crudappliction();
		System.out.println("1.ADD STUDENT");
		System.out.println("2.UPDATE STUDENT");
		System.out.println("3.DELETE STUDENT");
		System.out.println("4.GET STUDENT");
		System.out.println("5.GET ALL STUDENTS");
		System.out.println("6.EXIT");
		
		
		while(true) 
		{System.out.println("Enter the Choice");
		int choice=sc.nextInt();
			switch(choice) {
				case 1:
					ob.Add();
	                 break; 
	
				case 2:
					ob.Update();
					break;
				case 3:
					ob.Delete();
					break;
				case 4:
						ob.getStudent();
					break;
				case 5:
					ob.allStudent();
					break;
				case 6:
					ob.Exit();
					break;
					}}}}
