class Factorial{
int fact=1;

public static void main(String arg[]) {
int no=5;
Factorial f= new Factorial();
int res=f.callFact(no);
System.out.println(res);
}

int callFact(int no)
{
if(no>1){
fact= fact*no;
callFact(no-1);}
return fact;
		

}}


