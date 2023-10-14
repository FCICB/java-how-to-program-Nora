import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter string :");
        String sentence= input.nextLine();
        String [] tokens=sentence.split(" \\s");
        Set<String> treeset=new TreeSet<>();
        for(String element:tokens){
            treeset.add(element);
        }
         for(String token:treeset){
             System.out.println(token);
         }
    }
}