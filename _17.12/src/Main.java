import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        String [] words=sentence.trim().split("\\s");
        Set<String> newword= new TreeSet<>((word1, word2)->word1.compareToIgnoreCase(word2));
        Arrays.stream(words).forEach(word->newword.add(word));
        System.out.println("new words in alphabetical order:");
        newword.forEach(word-> System.out.println(word));
    }
}