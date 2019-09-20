
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;


public class Test {
    public static void main(String[] args) {
      
        
        
        int x[]={10,15,25,34,5,55,31,1,2,22};
        
        for(int n:x){
            System.out.print(n+"  ");
        }
        Arrays.sort(x);
        System.out.println("\nAfter Sorting : ");
        
        for(int n:x){
            System.out.print(n+"  ");
        }
        
        int idx=Arrays.binarySearch(x, 24);
        
        System.out.println("\nIndex : "+idx);
        
    }
}
