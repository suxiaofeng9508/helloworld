import java.io.FileOutputStream;
import java.io.IOException;

public class Example02 {
public static void main(String[] args) throws InterruptedException, IOException {
FileOutputStream fileOutputStream = new FileOutputStream("example.txt");
String str="我的名字叫苏晓峰";
byte[] b = str.getBytes();
for (int i = 0; i < b.length; i++) {
	fileOutputStream.write(b[i]);;
}
fileOutputStream.close();
}
}
