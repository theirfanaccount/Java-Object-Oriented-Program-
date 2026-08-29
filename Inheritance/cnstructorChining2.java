package Inheritance;
// CONSTRUCTOR CHINING
/* 
    parameterise constructor chining
*/
class Car{
    int price;
    float milage; 
    Car(){
        price = 10000;
        milage = 40.5f;

    }
    Car(int price,float milage){
        this.price = price;
        this.milage = milage;
    }

}
class BMW extends Car{
    String model;
    int fuelCapacity;
    BMW(String model,int fuuelCapacity,int price,float milage){
        super(price,milage);
        this.model = model;
        this.milage = milage;

    }
    void disp(){
        System.out.println(price);
        System.out.println(milage);
        System.out.println(model);
        System.out.println(milage);
    }
}
public class cnstructorChining2 {
    public static void main(String[] args){
        BMW b1 = new BMW("BMW x5", 45, 23000, 10.5f);
        b1.disp();
    }
}
