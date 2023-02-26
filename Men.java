class Men extends BankAccount{

@Override
public void accountNumber(){
System.out.println("Every men having different accounyt number " );
}

@Override
public void Password(){
System.out.println("Every men having different password " );
}
	
public static void main(String arg[]){
Men m=new Men();
m.accountNumber();
m.Password();
}}
