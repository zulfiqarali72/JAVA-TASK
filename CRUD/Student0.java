
public class Student0 {
	private Integer id;
	private String name;
	private Integer age;
	private String rollNumber;
	private String email;


	public Integer getId() {
		return id;
	}
	public void setId(Integer Id) 
	{this.id=id;}
	public String getName() {
		return name;
	}
	public void setName( String name) 
	{this.name=name;}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) 
	{this.age=age;}

	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber( String rollNumber) 
	{this.rollNumber=rollNumber;}
	public String getEmail() {
		return email;
	}
	public void setEmail( String email) 
	{this.email=email;}
	@Override
	public String toString() {
		return(id+"id"+name+"name"+age+"age"+rollNumber+"rollNumber"+email+"email");
	}
}
