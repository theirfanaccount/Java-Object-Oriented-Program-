package Inheritance;
class first{
    int i = 123;
    void method1(){
        System.out.println("Method of parent/superclass class");
    }
}
class second extends first{
    int i = 100;//new variable of class second but variable name is same as parent class
    @Override
    void method1(){
        System.out.println(i);
        System.out.println(super.i);
        super.method1();//access parent class method when child class is override.

    }
}
public class superKeword {
    public static void main(String[] args){
        second s = new second();
        
        s.method1();
    }
}
