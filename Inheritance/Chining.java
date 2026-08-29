package Inheritance;

class superClass{
    int x;
    int y;
    superClass(int x,int y){
        this.x = x;
        this.y = y;
        System.out.println("1. parent constructor execution");
    }
}
class subClass extends superClass{
    int a;
    int b;
    // local chining
    subClass(){
        this(100,200);
        System.out.println("3. child no args constructor finished");
    }
    // constructor chining
    subClass(int a, int b){
        super(a,b);
        this.a = a;
        this.b =b;
        System.out.println("2. child parameterise constructor finished");
    }
    void disp(){
        System.out.println(x + " "+ y +" "+ a + " "+ b);
    }
}

public class Chining {
    public static void main(String[] args){
        subClass c = new subClass();
        c.disp();
    }
}
