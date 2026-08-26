package Static;
class Execution{
    static int a,b;
    static{
        System.out.println("inside static block");
        a = 10;
        b = 20;
    }
    static void fun1(){
        System.out.println("inside Ststic method");
    }
    int x,y;
    {
        x = 100;
        y = 200;

    }
    {
        System.out.println("inside instance block");
    }
    void fun2(){
        System.out.println("Inside instance method");
    }
    Execution(){
        System.out.println("Inside constructor");
    }
}
public class ststicExecution {
    public static void main(String[] args){
        Execution.fun1();
        Execution e = new Execution();
        e.fun2();
    }
}
