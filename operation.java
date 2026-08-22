import java.util.*;
public class operation{
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        int Element = list.get(3);

        System.out.println(Element);

        int RemoveElement = list.remove(4);

        System.out.println(RemoveElement);

        list.set(3,35);
        list.contains(2);

        list.size();


        System.out.println(list.size());
       

    }
}