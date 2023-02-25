class reverseString{
public static void main(String arg[]) {
String name="deepak";
String rev="";		 
for (int i=name.length()-1;i>=0;i--) {
rev=rev+name.charAt(i);
}
System.out.println(rev);
}
}

