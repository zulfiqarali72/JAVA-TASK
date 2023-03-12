class TestStudent {
	public static void main(String arg[]){

Student2 s=new Student2();
s.setRollNo(18);
s.setName("Haider");
s.setAge(19);

Department department=new Department();
department.setName("CS");
department.setLocation("Jamshoro Sindh");

s.setDepartment(department);

System.out.println(s.getRollNo());
System.out.println(s.getName());
System.out.println(s.getAge());
System.out.println(s.getDepartment().getName());
System.out.println(s.getDepartment().getLocation());
	}











}