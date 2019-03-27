import java.io.FileWriter;
import java.io.IOException;

public class Example08 {
public static void main(String[] args) throws Exception {
	FileWriter fileWriter = new FileWriter("writer.txt");
	String str = "苏晓峰";
	fileWriter.write(str);
	fileWriter.close();
}
}
