class Rodent {
public void eat() {
	System.out.println("Rodent eat method");
}
public void run() {
	System.out.println("Rodent run method ");
}
}
class Mouse extends Rodent {
	@Override
public void eat() {
		System.out.println("Mouse eat method");
	}
@Override
	public void run() {
		System.out.println("Mouse run method ");
	}
}
class Gerbil extends Rodent  {
	
@Override
public void eat() {
		System.out.println("Gerbil eat method");
	}
@Override
	public void run() {
		System.out.println("Gerbil run method ");
	}
}
 class Hamster extends Rodent {
@Override
	public void eat() {
		System.out.println("Hamster eat method");
	}
@Override
	public void run() {
		System.out.println("Hamster run method ");
	}
}
class Base1 {
public static void main(String arg[]) {
	Rodent[] r=new Rodent[3];
	r[0]=new Mouse();
	r[1]=new Gerbil();
	r[2]=new Hamster(); 
	r[0].eat();
	r[0].run();
	r[1].eat();
	r[1].run();
	r[2].eat();
	r[2].run();
	
}
}
