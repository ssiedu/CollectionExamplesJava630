
public class BoxUnboxDemo {

    public static void disp(int i){
        System.out.println(i*5);
    }
    public static void show(Object ob) {
        System.out.println(ob);
    }

    public static void main(String[] args) {
        Integer ob1=new Integer(4);
        disp(5);
        disp(new Integer(3));
        disp(ob1);
        disp(10);
        
        
        show("abc");
        show(true);
        show(new StringBuffer("xyz"));
        show(2);

    }

}
