import java.util.LinkedList;
public class classroom{
    public static void main(String[]args){
        LinkedList <Integer> ll = new LinkedList<>();
       
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addFirst(0);
        System.out.println(ll);
        System.out.println(ll.reversed());
       
    }
}