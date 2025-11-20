import java.util.*;
public class jc4{
    public static void main(String [] args){
        ArrayList<Integer> a =new ArrayList<>();
        a.add(40);
        a.add(20);
        a.add(30);
        a.add(1);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        for (int i:a){
            System.out.println(i);
        
        }
    }
}