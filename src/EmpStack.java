
import java.util.Stack;


public class EmpStack {

    public static void main(String[] args) {

        Stack<Emp> stk=new Stack<>();
        stk.push(new Emp(111,"AAA",50000));
        stk.push(new Emp(112,"BBB",60000));
        stk.push(new Emp(113,"CCC",70000));
        for(int i=1; i<=3; i++){
            
            Emp e=stk.pop();
            System.out.println(e);                                                  
            
            
        }
            
        
        
        /*
        int i=1;
        for(Emp e:stk){
            System.out.println("Element : "+i+"=>"+e);
            i++;
        }
        System.out.println(stk);
        */
        
        /*
        System.out.println(stk);
        Emp e1=stk.pop();
        System.out.println(e1);
        System.out.println(stk);
        Emp e2=stk.pop();
        System.out.println(e2);
        System.out.println(stk);
        Emp e3=stk.pop();
        System.out.println(e3);
        
        System.out.println(stk);
        */
    }
}
