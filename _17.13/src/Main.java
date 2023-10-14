import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Character>list=new ArrayList<>() ;
        Random random =new Random();
        for(int i=0;i<=30;i++){
            char randomchar=(char)(random.nextInt(26)+'a');
            list.add(randomchar);
        }
        System.out.println("original list:");
        System.out.println(list);
        List<Character>ascendinglist=list.stream().sorted().collect(Collectors.toList());
        //Collections.sort(list);
        System.out.println("ascending order:");
        System.out.println(ascendinglist);
        List<Character>descendinglist=list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
        //Collections.sort(list,Collections.reverseOrder());
        System.out.println("descending order:");
        System.out.println(descendinglist);
        //Set<Character>uniqueset=new HashSet<>(list) ;
        List<Character>nora= list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("sorted without duplicates :");
        System.out.println(nora);
    }
}