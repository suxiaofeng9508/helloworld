import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example07 {
public static void main(String[] args) throws Exception {
	FileReader fileReader = new FileReader("d:\\su\\test.txt");
	int ch = 0;
	while((ch=fileReader.read())!=-1){
		System.out.println((char)ch);
	}
	fileReader.close();
}
}
