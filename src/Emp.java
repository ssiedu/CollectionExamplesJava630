public class Emp {
   private int eno;
   private String ename;
   private int sal;

    public Emp(int eno, String ename, int sal) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
    }
   
  

    @Override
    public String toString() {
        return "Emp{" + "eno=" + eno + ", ename=" + ename + ", sal=" + sal + '}';
    }
   
 
}
