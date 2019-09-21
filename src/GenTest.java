public class GenTest<T1,T2> {
    
    void add(T1 p){}
    void sub(T2 p){}
    
    public static void main(String args[]){
        
        GenTest<String,Double> ob1=new GenTest<>();
        GenTest<Boolean,Long> ob2=new GenTest<>();
        GenTest ob3=new GenTest<>();
        
    }
    
}
