package Encapsulation;
//POJO class:- 1.private field 2.public setter and getter 3. A default no- args constructor 4.no extending special classes
class myEmploy{
    //private field
    private int id;
    private String name;
    private int salary;
    // no args constructor (if i don't give any constructor the java compiler automatically attached a default no args constructoe and it still called pojo class (also other 3 condition is fulfilled))
    myEmploy(){
        //also can give body
    }
    // paramererised constructor
    myEmploy(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;

    }
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
public class POJOclass {
    public static void main(String[] args){
        //object creation which call 0 parametarise constructor
        myEmploy e = new myEmploy();
        e.setId(12323);
        e.setName("irfan");
        e.setSalary(300000);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

        //another object creation which calls parametarise constructor
        myEmploy e2 = new myEmploy(232432,"ankit", 60000);
        System.out.println(e2.getId());
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
    }   
}
