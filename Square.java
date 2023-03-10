public class Square implements Shape  {

@Override
public void printLine(String s) {
System.out.println("Hello I am Square");
}
public static void main(String arg[]) {
	Square s1=new Square();
	s1.printLine("Square");
}
}