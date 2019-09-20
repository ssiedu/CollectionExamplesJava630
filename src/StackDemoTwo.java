
import java.util.Stack;


public class StackDemoTwo {
    public static void main(String[] args) {

        Stack stk=new Stack();
        stk.push("one");
        stk.push(2);
        stk.push(3.0);
        
        Double d1=(Double)stk.pop();
        //System.out.println(d1.doubleValue()*2);
        System.out.println(d1*2);
        
        Integer i1=(Integer)stk.pop();
        //manual unboxing
        //System.out.println(i1.intValue()+1);
        //auto-unboxing
        System.out.println(i1+1);
        
        
        
        
        
        
        
    }
}
