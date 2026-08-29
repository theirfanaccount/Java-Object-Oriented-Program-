package Inheritance;
class Father{
    String skinColorc = "brown";
    float height = 5.6f;
    void readBook(){
        System.out.println("I love read books");

    }
    void noSmoke(){
        System.out.println("I hate smoke");
    }

}
class son extends Father{
    
}
public class inheritanceIntroduction {
    public static void main(String[] args){
        son c = new son();
        c.readBook();
        c.noSmoke();
        System.out.println(c.height);

    }
}
