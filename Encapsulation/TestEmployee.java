class TestEmployee {
	public static void main(String arg[]){

Employee1 e=new Employee1();

e.setName("Hasnien");
e.setAge(24);
e.setRank("Manager");

Bank bank=new Bank();
bank.setName("HBL");
bank.setBranch("Muet Jamshoro");

e.setBank(bank);


System.out.println(e.getName());
System.out.println(e.getAge());
System.out.println(e.getRank());
System.out.println(e.getBank().getName());
System.out.println(e.getBank().getBranch());
	}


}





