import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Test2 {
	public static void main(String[] args) {
		List<Employee> employees =new ArrayList<>();
		Employee e=new Employee();
		e.setName("Rehan");
		e.setAge(23);
		e.setSalary(8000.14);
		e.setDepartment("CS");
		Employee e1=new Employee();
		e1.setName("Hasnien");
		e1.setAge(22);
		e1.setSalary(8000.14);
		e1.setDepartment("CS");
		employees.add(e);
		employees.add(e1);
		 Collections.sort(employees);

	      
		System.out.println(employees);
		}
}




