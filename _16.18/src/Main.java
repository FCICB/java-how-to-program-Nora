import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character>list=new LinkedList<>();
        for(char i='a';i<'j';i++){
            list.add(i);
        }
        LinkedList <Character>reversedlist=new LinkedList();
        for(int i=list.size()-1;i>=0;i--){
            reversedlist.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(reversedlist);

    }
}