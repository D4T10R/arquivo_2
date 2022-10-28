package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public  class Program {

    public static void main(String[] args) {
        
        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
        String[] lines2 = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
        String path = "c:\\Users\\Leona\\Documents\\teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {  // iniciar para poder escrever dentro de um arquivo
            
            for (String line : lines) {
                bw.write(line); // escrever algo dentro de um arquivo
                bw.newLine(); // nova linha
            }
        
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // o TRUE serve para não apagar o arquivo ja existente para pode editar

            for (String line : lines2) {
                bw.write(line);
                bw.newLine();
            }

            

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(br.readLine());
                line = br.readLine();
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}