import java.io.FileReader;
import java.io.IOException;
public class Introduction {
  public static void main(String[] args) throws IOException{
    String path = "./input.txt";
    FileReader filereader = new FileReader(path);
    int cnt = 0;
    while(filereader.ready()){
      System.out.print((char)filereader.read());
    }
    filereader.close();
  }
}
