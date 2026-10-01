package Inheritance;
// understand code flow of execution if inheritance
class parent{
    static{
        System.out.println("Inside static block of parent");  // 1st 

    }
    {
        System.out.println("Inside instance block of parent"); //2nd 
    }
    public parent(){
        System.out.println("Inside constructor of parent"); // 3rd
    }
}
class child extends parent{
    static{
        System.out.println("Inside static block of child"); // 4th
    }
    {
        System.out.println("Inside instance block of child");// 5th
    }
    public child(){
        System.out.println("Inside constructor of child"); //6th
    }
}
public class ExecutionofCode {
    public static void main(String[] args){
        child c = new child();
    }
}

// output :- 1 -> 4 -> 2 -> 3 -> 5 -> 6