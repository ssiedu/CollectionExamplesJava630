
import java.util.HashMap;
import java.util.Scanner;


public class MapExampleTwo {

    public static void main(String[] args) {

        Emp e1=new Emp(111,"AAA",50000);
        Emp e2=new Emp(112,"BBB",60000);
        Emp e3=new Emp(113,"CCC",70000);
        Emp e4=new Emp(114,"DDD",80000);
        
        HashMap<Integer,Emp> map=new HashMap<>();
        
        map.put(111, e1); map.put(112, e2);
        map.put(113, e3); map.put(114, e4);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Empno : ");
        int n=sc.nextInt();
        
        Emp emp=map.get(n);
        
        System.out.println(emp);
        
        
    }
}
