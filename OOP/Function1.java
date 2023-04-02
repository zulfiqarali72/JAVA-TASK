import java.util.Scanner;
class Function1 {
int sum=0;
	
public int  sum(int[] arr) {	
for(int i=1;i<arr.length;i++) {
sum=sum+arr[i];
}
return sum;
}
public int sum(int[] arr,char ch) {
	
int even=0;
int odd=0;
if(ch=='e') 
{
for(int i=0;i<arr.length;i++) {
if(arr[i]%2==0) {
    even=even+arr[i];
 }}
   return even;
}

else if(ch=='o') {
for(int i=0;i<arr.length;i++) {
 if(arr[i]%2!=0) {
     odd=odd+arr[i]; }
 }
		
return odd;
}

else {
return 0;}
}
public static void main(String arg[]) {

Function1 obj=new Function1();
Scanner  sc=new Scanner(System.in);
int length=5;
int[] arr=new int [length];

System.out.println("Enter Array element");
   for(int i=0;i<arr.length;i++) 
 {
   arr[i]= sc.nextInt();
}
System.out.println("Enter the choice ");
  char ch=sc.next().charAt(0);

System.out.println(obj.sum(arr));
   if(ch=='e') {
          System.out.println("Sum of all even numbers: "+obj.sum(arr,ch));
}
else if(ch=='o') {
         System.out.println("Sum of all odd numbers:"+obj.sum(arr,ch));
}
else {
System.out.println(" Wrong Choice");
}

 
}
}
