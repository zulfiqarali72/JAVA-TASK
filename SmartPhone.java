class SmartPhone extends Mobile {

@Override
public void lock(){
System.out.println("Smartphone have  many type of lock like pattern,facelock,finger etc" );
}

@Override
public void camera(){
System.out.println("Smartphone have back and as well as front Camera " );
}
	
public static void main(String arg[]){
SmartPhone s=new SmartPhone();
s.lock();
s.camera();
}}
