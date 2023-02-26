class Women extends BankAccount{

@Override
public void accountNumber(){
System.out.println("Every Women having different accounyt number " );
}

@Override
public void Password(){
System.out.println("Every Women having different password " );
}
	
public static void main(String arg[]){
Women w=new Women();
w.accountNumber();
w.Password();
}}