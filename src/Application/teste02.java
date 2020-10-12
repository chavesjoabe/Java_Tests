package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class teste02 {
    public static void main(String[] args) {
        String path = "/Users/joabechaves/Documents/Developments/Udemy/JAVA/";
        String[] lines = new String[]{"Ola", "Mundo"};
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path+"out.txt"))){
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Unexpected error");
        }
    }
}
