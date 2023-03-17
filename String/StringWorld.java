import java.util.Scanner;
public class StringWorld {
 String line;
String wordpanlin;
String diagnose;
 String word1;
 String word2;
public void reverse(String line) {
this.line=line;
	String rev="";
	for(int i=line.length()-1;i>=0;i--) {
		rev=rev+line.charAt(i);
}
System.out.println("Reverse String is :"+rev);
}
	
public void palindrome(String wordpanlin) {
this.wordpanlin=wordpanlin;
String rev="";
for(int i=wordpanlin.length()-1;i>=0;i--) {
	rev=rev+wordpanlin.charAt(i);
}

if(wordpanlin.equals(rev)) {
	System.out.println(rev+" is a Palindrome String");
}
else {
System.out.println(rev+" is a not Palindrome String");
}}
public void anagram(String word1,String word2) {
this.word1= word1;
this.word2= word2;

if(this.word1.length()==this.word2.length()) {
char a1[] = word1.toCharArray();
char a2[] = word2.toCharArray();
	
for(int i = 0 ; i < word1.length();i++)
 {
  for(int j = i+1 ; j< word1.length();j++)
 {
      if(a1[i] >a1[j])
  {
 char temp = a1[i];
 a1[i] = a1[j];
 a1[j] = temp;
            }			
}}
for(int i = 0 ; i < word2.length();i++)
    {
     for(int j = i+1 ; j< word2.length();j++)
  {
    if(a2[i] >a2[j])
     {
    char temp1 = a2[i];
    a2[i] = a2[j];
    a2[j] = temp1;}}} }
String s1 = new String(word1.toCharArray());
String s2 = new String(word1.toCharArray());
    if(s1.equals(s2)){
    System.out.println(word1+" And "+word2+" are Anagram");
   }
else{
  System.out.println(word1+" And "+word2+" are Not Anagram");
  }}
	

public void checkstring(String diagnose) {
int vowel=0;
int consonants=0;
int spaces=0;
this.diagnose=diagnose;

for(int i=0;i<diagnose.length();i++) {
if(diagnose.charAt(i)=='a'||diagnose.charAt(i)=='e'||diagnose.charAt(i)=='i'||diagnose.charAt(i)=='o'||diagnose.charAt(i)=='u') {
	vowel++;
}
else if(diagnose.charAt(i)!='a'&& diagnose.charAt(i)!='e'&& diagnose.charAt(i)!='i'&&diagnose.charAt(i)!='o'&&diagnose.charAt(i)!='u'&&diagnose.charAt(i)!=' ') {
	consonants++;
}
else if (diagnose.charAt(i)==' ') {
spaces++;}
}System.out.println("Vowels "+vowel);
System.out.println("consonats "+consonants);
System.out.println("spaces "+spaces);


}		
public static void main(String arg[]) {

	System.out.println("WELCOME TO STRING WORLD");

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the any String : ");
	String line =sc.nextLine();
	StringWorld s=new StringWorld();
	s.reverse(line);

	System.out.println("Enter the any Any String  : ");
	String wordpanlin=sc.nextLine();
	s.palindrome(wordpanlin);

	System.out.println("Enter the word1  : ");
	String word1=sc.nextLine();
	System.out.println("Enter the word2  : ");
	String word2=sc.nextLine();
	s.anagram(word1,word2);

	System.out.println("Enter the String for Diagnose : ");
	String diagnose=sc.nextLine();
	s.checkstring(diagnose);
	
}
}