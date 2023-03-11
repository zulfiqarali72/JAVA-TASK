public class BankIntreset1 extends Interest {
@Override
public void Simpleintreset(double p, double t) {
	int r= 25;
	double SpIn=(p*t*r)/100;
	System.out.println("Simple Intreset of Bank1: "+SpIn);

}
public static void main(String arg[]){
BankIntreset1 i=new  BankIntreset1();
i.Simpleintreset(564.789,15.6);
}
}

