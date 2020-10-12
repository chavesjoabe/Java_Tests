package Application;

import System_Entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        String path = "/Users/joabechaves/Documents/Developments/Udemy/JAVA/";
        try (BufferedReader br = new BufferedReader(new FileReader(path+"teste.csv"))) {
            String line = br.readLine();
            while (line != null) {
                String[] features = line.split(",");
                list.add(new Product(features[0], Double.parseDouble(features[1]), Double.parseDouble(features[2])));
                line = br.readLine();
            }
            System.out.println(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Deseja exportar os dados do almoxarifado?  -- s/n");
        String res = scanner.next();
        if(res.equalsIgnoreCase("s")){

        boolean success = new File(path+ "/out").mkdir();
            System.out.println("pasta criada com sucesso!! ");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path+"/out/summary.txt"))){
            for (Product product : list){
                bw.write(product.getName()+ ", " + product.totalValue());
                bw.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Deu ruim");
        }
        }
        else{
            System.out.println("Obrigado!! ");
        }
    }
}
