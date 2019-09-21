public class GenUserThree {
    public static void main(String[] args) {
        GenDemo<Integer> ob1=new GenDemo<>();
        ob1.show(10);
        //ob1.show("abcd");
        
        GenDemo ob2=new GenDemo();
        ob2.show("abcd");
        ob2.show(10);
        ob2.show(2.35);
        
        
    }
}
