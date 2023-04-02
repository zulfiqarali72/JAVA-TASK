class HeadOfDepartment {
	String name;
	 String  deptname;
	 int age;
	String rank;

	public  HeadOfDepartment(String name,String deptname,int age,String rank) {
		this.name=name;
		this.age=age;;
		this.deptname=deptname;
		this.rank= rank;
			
	}
	public void   DisplayInformation() {
		System.out.println("Name:"+name);
		System.out.println("Department Name:"+deptname);
		System.out.println("Age:"+age);
		System.out.println("Rank:"+rank);
		System.out.println();
		
	}
	}



class CoOrdinator extends HeadOfDepartment {
	public  CoOrdinator (String name,String deptname,int age,String rank) {
		super(name, deptname,age,rank);
	}
	public void   DisplayInformation() {
		super.DisplayInformation();
	}
}

 class Faculties extends CoOrdinator {
	public  Faculties (String name,String deptname,int age,String rank) {
		super(name, deptname,age,rank);
	}
	public void   DisplayInformation() {
		super.DisplayInformation();
	}
}


 class Students extends  Faculties  {
	 public  Students  (String name,String deptname,int age,String rank) {
			super(name, deptname,age,rank);
		}
		public void   DisplayInformation() {
			super.DisplayInformation();
		}
}

public class Base2 {
	public static void main(String arg[]) {
		HeadOfDepartment hd=new HeadOfDepartment("Saddam","IT",35,"Chairman");
		hd.DisplayInformation();

		CoOrdinator co=new CoOrdinator("Hasnien","IT",26,"Class Co-Ordinator");
		co.DisplayInformation();

		Faculties f=new Faculties("Rehan","IT",22,"Teacher");
		f.DisplayInformation();

		Students sc=new Students("Sarfraz","IT",19,"Student");
		sc.DisplayInformation();
		
		
		
		
		
	}
}
