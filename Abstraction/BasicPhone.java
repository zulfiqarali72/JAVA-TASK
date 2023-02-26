class BasicPhone extends Mobile {

@Override
public void lock(){
System.out.println("BasicPhone have simple lock" );
}

@Override
public void camera(){
System.out.println("BasicPhone have single camera" );
}
	
public static void main(String arg[]){
BasicPhone s=new BasicPhone();
s.lock();
s.camera();
}}