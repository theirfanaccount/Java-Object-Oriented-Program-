package Interfaces;
// @FunctionalInterface 
interface Display2{
     void disp();

}

public class FI_anonymousInnerClass {
    public static void main(String[] args){
        Display d = new Display() {
            @Override
            public void disp(){
                System.out.println("method of anonymous inner class");
            }
        };
        d.disp();
    }
}
