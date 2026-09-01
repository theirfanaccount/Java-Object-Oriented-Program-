package Inheritance;
class upper{
    void fun1(){
        System.out.println("hii");
    }
    static void name(){
        System.out.println("I am a static method of upper class");
    }
}
class lower extends upper{
    //overriden method
    @Override
    void fun1(){
        System.out.println("hola");
    }
    // method hiding
    public static void name(){
        System.out.println("I am a static method of lower class");
    }
}
public class methodHinding {
    public static void main(String[] args){
        lower l = new lower();
        l.fun1();
        lower.name();
    }
}
