import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example03 {
public static void main(String[] args) throws Exception {
	OutputStream outputStream = new FileOutputStream("example.txt",true);
	String str= "真好听！！";
	byte[] b = str.getBytes();
	for (int i = 0; i < b.length; i++) {
		outputStream.write(b[i]);
	}
	outputStream.close();
}
}
