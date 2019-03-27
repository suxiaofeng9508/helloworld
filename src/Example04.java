import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example04 {
public static void main(String[] args) throws Exception {
	InputStream in = new FileInputStream("d:\\su\\test.txt");
	OutputStream out = new FileOutputStream("d:\\xiao\\test.txt");
	int len;
	while((len = in.read())!=-1){
		out.write(len);
	}
	in.close();
	out.close();
}
}
