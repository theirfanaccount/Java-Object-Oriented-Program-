package Polymorphism;
class planeStatus{
     void takeOff(){
        System.out.println("palne is taking off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
    void land(){
        System.out.println("plane is landing");
    }
}
class cargoPlane extends planeStatus{
    @Override
    void takeOff(){
        System.out.println("CargoPlane is taking off");
    }
    @Override
    void fly(){
        System.out.println("Cargo pane is flying");
    }
    @Override
    void land(){
        System.out.println("Cargo pane is landing");
    }

}
class passengerPlane extends planeStatus{
    @Override
    void takeOff(){
        System.out.println("Passenger plane is taking off");
    }
    void fly(){
        System.out.println("Passenger plane is flying");
    }
    void land(){
        System.out.println("Passsenger plane is landed");
    }
}
class fitherPlane extends planeStatus{
    @Override
    void takeOff(){
        System.out.println("Fighter plane is taking off");

    }
    @Override
    void fly(){
        System.out.println("Fighter plane is flying");
    }
    @Override
    void land(){
        System.out.println("fighter plane is landed");
    }
}
class airport{
    void printStatus(planeStatus p){
        p.takeOff();
        p.fly();
        p.land();
    }
}
public class plane {
    public static void main(String[] args){
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fitherPlane fp = new fitherPlane();

        airport a = new airport();

        a.printStatus(cp);
        a.printStatus(pp);
        a.printStatus(fp);
        
    }
}
