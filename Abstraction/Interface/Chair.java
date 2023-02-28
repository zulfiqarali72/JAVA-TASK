class Chair implements Furniture{

@Override
public void area(){
System.out.println("Area of chair");
}


	
public static void main(String arg[]){
Chair c=new Chair();
c.area();}}