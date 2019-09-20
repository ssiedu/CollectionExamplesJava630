
import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list);
        list.addFirst("four");
        System.out.println(list);
        list.addLast("five");
        System.out.println(list);
        list.add(2,"six");
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(2);
        System.out.println(list);
        
        
    }
}
