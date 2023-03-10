class AreaOverloading{

public void Area(Double l,Double w) {
Double Area=l*w;
       System.out.println("Area of Rectangle: "+Area);
}

public void Area(Double r) {
Double Area=3.14*(r*r);
      System.out.println("Area of Circl: "+Area);
}
public void Area(int l) {
int Area=l*l;
	System.out.println("Area of Square: "+Area);
}
public static void main(String arg[]) {
	AreaOverloading d= new AreaOverloading();
	d.Area(3.01,1.3);
	d.Area(7.3);
	d.Area(7);
		
}
}
