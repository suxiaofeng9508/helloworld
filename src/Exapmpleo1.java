import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exapmpleo1 {
public static void main(String[] args) throws IOException {
	FileInputStream fileInputStream = new FileInputStream("D://su//test.txt");
    int b=0;
    while(true){
    b=fileInputStream.read();
    if(b==-1){
    	break;
    }
    System.out.println(b);
    }
    fileInputStream.close();
}
}
