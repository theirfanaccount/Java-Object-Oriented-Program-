package Inheritance;
class parent{
    String skinColorc = "brown";
    float height = 5.6f;
    void readBook(){
        System.out.println("I love read books");

    }
    void noSmoke(){
        System.out.println("I hate smoke");
    }

}
class child extends parent{
    
}
public class inheritanceIntroduction {
    public static void main(String[] args){
        child c = new child();
        c.readBook();
        c.noSmoke();
        System.out.println(c.height);

    }
}
