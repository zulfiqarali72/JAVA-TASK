
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Filling {
public static void main(String arg[]) throws IOException {
	
	FileWriter fw=null;
	try {File file=new File("students.txt");
	fw=new FileWriter(file);
	Student2 s=new Student2();
	s.setId(1);
	s.setName("Hasnien");
	s.setRollNum("20cs01");
	Student2 s1=new Student2();
	s1.setId(2);
	s1.setName("Azam");
	s1.setRollNum("20cs02");
	Student2 s3=new Student2();
	s3.setId(3);
	s3.setName("Shahzad");
	s3.setRollNum("20cs03");
	Student2 s4=new Student2();
	s4.setId(4);
	s4.setName("Naseem");
	s4.setRollNum("20cs02");
	fw.write("ID,NAME,ROLLNUM\n");
	fw.write(s.getId()+","+s.getName()+"," +s.getRollNum()+"\n");
	fw.write(s1.getId()+","+s1.getName()+"," +s1.getRollNum()+"\n");
	fw.write(s3.getId()+","+s3.getName()+"," +s3.getRollNum()+"\n");
	fw.write(s4.getId()+","+s4.getName()+"," +s4.getRollNum()+"\n");
	}
	catch (IOException ex){ex.printStackTrace();} 
	finally
	{fw.close();}
	
	System.out.println("Now Get the All Data");
	FileReader fr=new FileReader("students.txt");
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
line=br.readLine();}
fr.close();
}
}
