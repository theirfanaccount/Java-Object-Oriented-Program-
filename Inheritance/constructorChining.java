package Inheritance;

// CONSTRUCTOR CHINING
/*  constructor chining is done by super() call, 
    it must be first line of code inside constructor 
    when we do not write super() it will auto injected(super() zero parameterised) by the java compiler

*/
class test{
    int x,y;
    test(){
        x = 100;
        y = 200;

    }
    

}
class test2 extends test{
    int a,b;
    test2(){
        a = 300;
        b = 400;
    }
    
    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}
public class constructorChining {
    public static void main(String[] args){
        test2 t =new test2();
        t.disp();
    }
}
