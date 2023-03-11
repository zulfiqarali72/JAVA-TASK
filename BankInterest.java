public class BankInterest extends Interest {
@Override
public void Simpleintreset(double p, double t) {
	int r= 20;
	double SpIn=(p*t*r)/100;
	System.out.println("Simple Intreset of Bank: "+SpIn);

}
public static void main(String arg[]){
BankInterest b=new  BankInterest();
b.Simpleintreset(333.44,12.3);
}
}
