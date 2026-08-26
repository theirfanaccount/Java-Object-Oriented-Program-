package Static;
class staticAccess{
    int a; // instance variable
    static int b; //static variable
    //instace block
    {
        a = 10;
        
    }
    static {
        b = 20;
    }
    {
        System.out.println(a); 
        System.out.println(b);  // can be accessable a static variable inside instance block
    }
    //static block
    static{
        // System.out.println(a);   can not accessable an instance variable inside static block
        System.out.println(b);
    }
}
public class staticBlock {
    public static void main(String[] args){
        staticAccess sa = new staticAccess();

    }
}
