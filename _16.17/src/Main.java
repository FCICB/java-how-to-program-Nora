import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        LinkedList<Integer>list=new LinkedList();
        Random random=new Random();
        for(int i=0;i<25;i++){
            int randomnumber=random.nextInt(101);
            list.add(randomnumber);
        }
        Collections.sort(list);
        int sum=0;
        for(int number:list){
            sum+=number;
        }
        double average=sum/list.size();
        System.out.println(list);
        System.out.println(sum);
        System.out.println(average);
        }
    }
