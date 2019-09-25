
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class MapExampleThree {
    public static void main(String[] args) {

        HashMap<Integer,String> workingDays=new HashMap<>();
        HashMap<Integer,String> offDays=new HashMap<>();
        
        workingDays.put(1, "Mon");
        workingDays.put(2, "Tue");
        workingDays.put(3, "Wed");
        workingDays.put(4, "Thu");
        workingDays.put(5, "Fri");
        
        offDays.put(6,"Sat");
        offDays.put(7,"Sun");
        
        Set<Integer> set=workingDays.keySet();
        System.out.println(set);
        Collection<String> days=workingDays.values();
        System.out.println(days);
        
        
        /*
        System.out.println(workingDays);
        System.out.println(offDays);
        System.out.println("______________________________");
        workingDays.putAll(offDays);
        System.out.println(workingDays);
        System.out.println(offDays);
        */
        
        
        
    }
}
