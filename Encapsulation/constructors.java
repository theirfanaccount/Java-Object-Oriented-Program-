package Encapsulation;

class Student1{
    private String sName;
    private int sRollNo;
    // Constructor to initialize the Student object
    Student1(String sName, int sRollNo) {
        this.sName = sName;
        this.sRollNo = sRollNo;
    }
    public String getsName() {
        return sName;
    }
    public int getsRollNo() {
        return sRollNo;
    }
}
public class constructors {
    public static void main(String[] args){
        Student1 s = new Student1("Irfan", 14);
    
        System.out.println(s.getsName());
        System.out.println(s.getsRollNo());
    }
}
