package Interfaces;
@FunctionalInterface 
interface Display3{
    void diap();
}
public class FI_LambdaExp {  //JDK 8 features
    public static void main(String[] args){
        Display d = () -> System.out.println("method of lambda function");
        d.disp();
    }
}
