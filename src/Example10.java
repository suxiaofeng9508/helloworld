import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Example10 {
public static void main(String[] args) throws Exception {
	FileInputStream in = new FileInputStream("writer.txt");
	InputStreamReader isr = new InputStreamReader(in);
	BufferedReader reader = new BufferedReader(isr);
	FileOutputStream out = new FileOutputStream("des.txt");
	OutputStreamWriter osw = new OutputStreamWriter(out);
	BufferedWriter bw = new BufferedWriter(osw);
	String line;
	while((line = reader.readLine())!=null){
		bw.write(line);
	}
	reader.close();
	bw.close();
}
}
