package Application;

import System_Entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\bkp\\Desktop\\Joabe\\Desenvolvimentos\\JAVA\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String line = br.readLine();
            while (line!=null){
                String[] features = line.split(",");
                list.add(new Product(features[0], Double.parseDouble(features[1]),Double.parseDouble(features[2])));
                line = br.readLine();
            }
            System.out.println(list);
            int i = 0;
            for (Product product:list) {
                System.out.println(list.get(i).getName()+", "+list.get(i).totalValue());
                i++;
            }

        }

        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
