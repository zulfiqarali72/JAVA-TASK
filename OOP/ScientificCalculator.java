class ScientificCalculator {
double avg;
double value;
public void calculateSin() {
System.out.println("Sin="+Math.sin(value));
}
public void calculateCos() {
System.out.println("Cos="+Math.cos(value));
}
public void calculateTan() {
System.out.println("Tan="+Math.tan(value));
}
public void CalcuateSumAvgMaxMin()
{
int sum=0;
int length=5;
int[] arr = {6,3,8,2,7,3};
int max=arr[0];
int min=arr[0];
for(int i=0;i<arr.length;i++) {
sum=sum+arr[i];
	 
    if (arr[i] > max) {
	max = arr[i];
}
    if (arr[i] < min) {
    min = arr[i];
}avg=sum/arr[i];}

System.out.println("Sum:"+sum);
System.out.println("Avg:"+avg);
System.out.println("Maximum value:"+max);
System.out.println("Minimum value:"+min);
}
public static void  main(String arg[]) {
ScientificCalculator c=new ScientificCalculator();
		
double value=Math.PI/4;
c.calculateSin();
c.calculateCos();
c.calculateTan();
c. CalcuateSumAvgMaxMin();
}
	
}
