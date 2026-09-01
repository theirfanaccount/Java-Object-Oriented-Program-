package Inheritance;
/* Methods of inheritence */


class plane{
    void fly(){
        System.out.println("Palne is flying");
    }
    void takeOff(){
        System.out.println("The plane is taking off");
    }
}
class passengerPlane extends plane{
    // Override method
    @Override
    void fly(){
        System.out.println("The cargo plane is flying at lowest heighest");
    }
    //specilised method
    void carryPassenger(){
        System.out.println("The plane is carry passenger");
    }
    // inherited method
    // void takeOff()

}
public class methodOfInheritance {
    public static void main(String[] args){
        passengerPlane pp =  new passengerPlane();
        pp.fly();
        pp.carryPassenger();
        pp.takeOff();
    }
}
