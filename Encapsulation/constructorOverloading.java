package Encapsulation;
class coustomer{
    // private variables
    private String cName;
    private int cId;
    private int cNumber;
    //parametarise constructor 1
    public coustomer(String cName,int cId,int cNumber){
        this.cName = cName;
        this.cId = cId;
        this.cNumber = cNumber;
    }
    //zero parametarise constructor 
    public coustomer(){
        this.cName = "irfan";
        this.cId = 96276;
        this.cNumber = 732193;

    }//parametarise constructor 2
    public coustomer(String cName){
        this.cName = cName;
        this.cId = 1234;
        this.cNumber = 3423424;
    }
    //public getters
    public String getcName() {
        return cName;
    }
    public int getcId(){
        return cId;

    }
    public int getcNumber(){
        return cNumber;
    }

}
class Display{
    void disp(coustomer c){
        System.out.println(c.getcName());
        System.out.println(c.getcId());
        System.out.println(c.getcNumber());
    }
}
public class constructorOverloading {
    public static void main(String[] args){
        //calling zero parametarise constructor during object creation
        coustomer c1 = new coustomer();
        // calling parameterise constructor 1 during object creation
        coustomer c2 = new coustomer("ankit", 123, 312313231);
        //calling parametarise constructor 2 during object creation
        coustomer c3 = new coustomer("prince");

        // cobject of Display method
        Display d = new Display();
        System.out.println("details of 1st coustomer");
        d.disp(c1);
         System.out.println("details of 2st coustomer");
        d.disp(c2);
         System.out.println("details of 3st coustomer");
        d.disp(c3);

        


    }
}
