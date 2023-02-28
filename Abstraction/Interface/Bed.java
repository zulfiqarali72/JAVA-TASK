class Bed implements Furniture{

@Override
public void area(){
System.out.println("Area of chair");
}


	
public static void main(String arg[]){
Bed b=new Bed();
b.area();
}
}