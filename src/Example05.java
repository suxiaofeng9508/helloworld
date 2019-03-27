import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Example05 {
public static void main(String[] args) throws Exception {
	InputStream inputStream = new FileInputStream("d:\\su\\test.txt");
	OutputStream outputStream = new FileOutputStream("d:\\xiao\\test.txt");
	byte[] buff = new byte[1024]; 
	int len = 0;
	while((len=inputStream.read(buff))!=-1){
		outputStream.write(buff,0, len);
	}
	inputStream.close();
	outputStream.close();
}
}
