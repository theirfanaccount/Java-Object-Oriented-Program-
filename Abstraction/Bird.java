package Abstraction;
abstract class Birds{
    abstract void eat();
    abstract void fly();

}
abstract class Eagle extends Birds{
    @Override 
    void fly(){
        System.out.println("Eagle is fly at highest");
    }
    abstract void eat();
}
class SepentEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("Sepant Eagle eat snakes");
    }

}
class GoldenEagle extends Eagle{
    @Override
    void eat(){
        System.out.println("Golden Eagle eat insects");
    }
}
public class Bird {
    static void print(Birds b){
        b.fly();
        b.eat();
    }
    public static void main(String[] args){
        SepentEagle se = new SepentEagle();
        GoldenEagle ge = new GoldenEagle();

        print(ge);
        print(se);
    }
}
