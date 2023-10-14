import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String sentence="this is java program ";
        Map<String,Integer> wordcount=  new HashMap<>();
        String cleansentence = sentence.replaceAll("[^a-zA-Z\\s]","").toLowerCase();
        String [] arrayofstring=cleansentence.split("\\s");
        for(String token:arrayofstring){
            if(wordcount.containsKey(token)){
                wordcount.put(token,wordcount.get(token)+1);
            }
            else {
                wordcount.put(token,1);
            }
        }
        for(Map.Entry<String,Integer>entry:wordcount.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        }
    }
