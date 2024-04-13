import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter filepath plzzz"); 
        String filepath = scnr.next();
        scnr.close();
        
        int longestSequence = 0;
        int currentSequence = 0;
       
        File file = new File(filepath);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String array[] = new String[20];
            String incomplete = "I";

            
            while ((line = br.readLine()) != null){
                array = line.split("\\s+");
            }

            for (int i = 1; i < array.length; i++){
                if (array[i] != null && array[i].toString().equals(incomplete) != true){
                    System.out.println(array[i]);
                    currentSequence++;
                    if (currentSequence > longestSequence){
                        longestSequence = currentSequence;
                    }
                } else {
                    System.out.println("Incomplete");
                    currentSequence = 0;
                }
            }

            System.out.println("Longest sequence = "+longestSequence);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
