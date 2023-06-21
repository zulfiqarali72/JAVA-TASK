
public class Employee implements Comparable<Employee>{
	
	    private String name;
	    private Integer age;
	    private Double salary;
	    private String department;

	   

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) 
		{this.name=name;}

	    public int getAge() {
	        return age;
	    }
	    public void setAge(Integer age) 
		{this.age=age;}

	    public Double getSalary() {
	        return salary;
	    }
	    public void setSalary(Double salary) 
		{this.salary=salary;}
	    public String getDepartment() {
	        return department;
	    }
	    public void setDepartment(String department) 
		{this.department=department;}
	    @Override
		 public String toString() {
			return "Employee{" + "Name="+name+",Age="+age+", Salary="+salary+",Department="+department+'}';
		}
	    @Override
		public int  compareTo(Employee o) {
			
			  return this.age.compareTo(o.getAge());
		  }
}
