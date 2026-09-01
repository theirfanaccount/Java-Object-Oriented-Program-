package Inheritance;
/*
    Rules of method overriding
    1. access modifier should be same or increase accessibility
    2. return type should be same
    3. co-varient return type
    4.number of parameter and its data type should be same
 */
class Door{
    void material(){
        System.out.println("It is made by wood");
    }
    void doorPrice(int price){
        System.out.println("price of Door is "+price);
    }
}
class houseDoor extends Door{
    @Override
    void material(){  // same accessibility
        System.out.println("House door is made by soft wood");
    }
    @Override
    void doorPrice(int price){ 
        System.out.println("price of house Door is "+price);
    }
}
class shopDoor extends Door{
    @Override
    public void material(){ // increase accessibility
        System.out.println("Shope door is made by hard wood");
    }
    @Override
    void doorPrice(int price){ 
        System.out.println("price of Shope Door is "+price);
    }

}


public class rulesOfOverriden {
    public static void main(String[] args){
        shopDoor sd = new shopDoor();
        sd.material();
        sd.doorPrice(1230);
        houseDoor hd = new houseDoor();
        hd.material();
        hd.doorPrice(2340);
    }
}
