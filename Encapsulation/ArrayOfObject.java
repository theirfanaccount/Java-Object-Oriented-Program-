package Encapsulation;

import java.util.Scanner;

class Employ{
    //private field
    private int id;
    private String name;
    private int salary;
    
    //public setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;

    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    //getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int  getSalary(){
        return salary;
    }

}
public class ArrayOfObject {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of employ");
        int noOfEmploy = scan.nextInt();
        scan.nextLine(); // overcome buffer problem
        //array of object
        Employ[] arr = new Employ[noOfEmploy];
        for(int i = 0;i<arr.length;i++){
            Employ e = new Employ();
            System.out.println("Enter details of "+(i+1)+"th employ (id,name,salary)");
            String details = scan.nextLine();
            String[] detailsArr = details.split(",");
            e.setId(Integer.parseInt(detailsArr[0]));
            e.setName(detailsArr[1]);
            e.setSalary(Integer.parseInt(detailsArr[2]));
            //storing object inside array of object on i[th] position
            arr[i] = e;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println("----------------------------");
            System.out.println("Details of "+(i+1)+"th employ");
            System.out.println("ID : "+arr[i].getId());
            System.out.println("Name : "+arr[i].getName());
            System.out.println("Salary : "+arr[i].getSalary());
            
        }
    }
}
