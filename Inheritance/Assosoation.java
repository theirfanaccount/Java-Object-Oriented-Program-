package Inheritance;
class OS{
    private String name;
    private float size;
    public OS(String name, float size){
        this.name = name;
        this.size = size;
    }
    public String getName(){
        return name;
    }
    public float getSize(){
        return size;
    }
}

class charger{
    private String brand;
    private float voltage;
    public charger(String brand,float voltage){
        this.brand = brand;
        this.voltage = voltage;
    }
    public String getBrand(){
        return brand;
    }
    public float getVoltage(){
        return voltage;
    }
}
// primary class
class mobile{
    //compostion
    OS os = new OS("IOS",6.0f);
    //agreegation
    void hasA(charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}

public class Assosoation {
    public static void main(String[] args){
        //moblie is there
        mobile m = new mobile();
        charger c = new charger("Apple",30.0f);
        m.hasA(c);
        System.out.println(m.os.getName());
        System.out.println(m.os.getSize());

        //mobile is lost
        // m = null;
        // System.out.println(c.getBrand());  we get output
        // System.out.println(c.getVoltage()); we get output
        // System.out.println(m.os.getName()); throw a exception NullPointerException
        // System.out.println(m.os.getSize()); throw a exception NullPointerException
    }
}
