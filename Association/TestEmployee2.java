class TestEmployee2 {
	public static void main(String arg[]){

Bank2 b=new Bank2();

b.setName("HBL");
b.setBranch("Muet Jamshoro");

Employee2  employee=new Employee2 ();
employee.setName("Ali");
employee.setAge(25);
employee.setRank("Manager");
b.setEmployee2(employee);


System.out.println(b.getName());
System.out.println(b.getBranch());
System.out.println(b.getEmployee2().getName());
System.out.println(b.getEmployee2().getAge());
System.out.println(b.getEmployee2().getRank());
	}


}





