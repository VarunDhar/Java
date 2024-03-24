import java.io.FileWriter;
import java.io.IOException;
public class Introduction {
  public static void main(String[] args) throws IOException{
    // Your code here:
    FileWriter filewriter = new FileWriter("output.txt");
    String outputText = "Java is boring.";
    filewriter.write(outputText);
    filewriter.close();
  }
}
