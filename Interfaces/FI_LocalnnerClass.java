package Interfaces;
@FunctionalInterface //JDK 8 features
interface Display{
    void disp();
}
public class FI_LocalnnerClass {
    public static void main(String[] args){
        class demo implements Display{
            @Override
            public void disp(){
                System.out.println("method of functional interface");
            }
        }
        demo d = new demo();
        d.disp();
    }
}
