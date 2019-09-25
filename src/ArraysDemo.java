
import java.util.Arrays;


public class ArraysDemo {
    public static void main(String[] args) {

        String days[]={"sun","mon","tue","wed","thu","fri","sat"};
        for(String day:days){
            System.out.println(day);
        }
        Arrays.sort(days);
        System.out.println("After Sorting");
        for(String day:days){
            System.out.println(day);
        }
        
    }
}
