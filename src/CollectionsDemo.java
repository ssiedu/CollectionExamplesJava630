
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String args[]){
        ArrayList<String> days=new ArrayList<>();
        days.add("sun"); days.add("mon");
        days.add("tue"); days.add("wed");
        days.add("thu"); days.add("fri");
        days.add("sat");
        System.out.println(days);
        //Arrays.sort(days);
        Collections.sort(days);
        System.out.println(days);
        
    }
}
