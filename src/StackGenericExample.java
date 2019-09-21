
import java.util.Stack;

public class StackGenericExample {
    public static void main(String[] args) {

        Stack<Integer> stk1=new Stack<>();
        stk1.push(10); 
        stk1.push(20); 
        //stk1.push("abc");
        //stk1.push("xyz");
        
        Stack<String> stk2=new Stack<>();
        stk2.push("abc");
        stk2.push("xyz");
        //stk2.push(5);
        //stk2.push(6);
        
        Stack stk3=new Stack();
        stk3.push(1);
        stk3.push(2);
        stk3.push("abc");
        stk3.push("xyz");
        stk3.push(true);
        stk3.push(4.5);
        
        System.out.println("Stakc 1= >"+stk1);
        System.out.println("Stakc 2= >"+stk2);
        System.out.println("Stakc 3= >"+stk3);
        
        
        
        
        
        
    }
}
