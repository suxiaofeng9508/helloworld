import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Example09 {
public static void main(String[] args) throws Exception {
	FileReader reader = new FileReader("writer.txt");
	BufferedReader br = new BufferedReader(reader);
	FileWriter writer = new FileWriter("des.txt");
	BufferedWriter bw = new BufferedWriter(writer);
	String str;
	while((str=br.readLine())!=null){
		bw.write(str);
		bw.newLine();;
	}
	br.close();
	bw.close();
}
}
