
import java.util.TreeMap;


public class MapExampleOne {
    public static void main(String[] args) {
        TreeMap<String,String> map=new TreeMap<>();
        //LinkedHashMap<String,String> map=new LinkedHashMap<>();
        //HashMap<String,String> map=new HashMap<>();
        map.put("president","Manish");
        map.put("secretary","Ashish");
        map.put("treasurer","Ravi");
        //map.put("vp", "Ashish");
        //String value=map.get("secretary");
        //System.out.println(value);
        System.out.println(map);
        
        boolean b=map.containsValue("president");
        System.out.println(b);
        
        
        /*
        ArrayList<String> list=new ArrayList<>();
        list.add("Manish");
        list.add("Ashish");
        list.add("Ravi");
        System.out.println(list);
        */
    }
}
/*
    Election    
        President, Secretary, Treasurer

*/
