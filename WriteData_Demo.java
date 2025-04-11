import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Demo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            
            fileWriter = new FileWriter("file.txt");
            
            
            fileWriter.write("Hello, this is a sample text written to file.txt!");
            System.out.println("Data has been successfully written to file.txt.");
        } catch (IOException e) {
            
            System.out.println("An IOException occurred: " + e.getMessage());
        } finally {
            
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                    System.out.println("FileWriter resource has been closed.");
                } catch (IOException e) {
                    System.out.println("Error while closing FileWriter: " + e.getMessage());
                }
            }
        }
    }
}
