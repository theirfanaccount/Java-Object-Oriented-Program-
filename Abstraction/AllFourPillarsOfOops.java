package Abstraction;

import java.util.Scanner;

abstract class shape{
    private float area;
    public void setArea(float area){
        this.area = area;
    }
    public float getArea(){
        return area;
    }
    abstract void calcArea();
    abstract void dispArea();
}
class square extends shape{
    private float side;
    public square(float side){
        this.side = side;
    }
    @Override
    void calcArea(){
        setArea(side*side);
    }
    @Override
    void dispArea(){
        System.out.println("The area of square is "+getArea());
    }
}
class rectangle extends shape{
    private float length;
    private float breath;
    public rectangle(float length, float breath){
        this.length = length;
        this.breath = breath;

    }
    @Override
    void calcArea(){
        setArea(length*breath);
    }
    @Override
    void dispArea(){
        System.out.println("The area of rectangle is "+getArea());
    }
}
class circle extends shape{
    private float radius;
    public circle(float radius){
        this.radius = radius;

    }
    @Override
    void calcArea(){
        setArea((float)(Math.PI*radius*radius));
    }
    void dispArea(){
        System.out.println("The area of circle is "+getArea());
    }
}
class diapArea{
    void display(shape s){
        s.calcArea();
        s.dispArea();
    }
}
public class AllFourPillarsOfOops {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        diapArea d = new diapArea();
        while(true){
            System.out.println("1. Area of square");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Area of circle");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Enter the side of square");
                    float side = scan.nextFloat();
                    square s = new square(side);
                    d.display(s);
                    break;
                case 2:
                    System.out.println("Enter the lenght of rectangle");
                    float length = scan.nextFloat();
                    System.out.println("Enter breath of rectangle");
                    float breath = scan.nextFloat();
                    rectangle r = new rectangle(length,breath);
                    d.display(r);
                    break;
                case 3:
                    System.out.println("Enter redius of circle");
                    float radius = scan.nextFloat();
                    circle c = new circle(radius);
                    d.display(c);
                    break;
                case 4:
                    System.out.println("Thank You! The program is ended");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Enter right choice");
            }

        }
    }
}
