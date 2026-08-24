package Encapsulation;
class student123{
    private String sName;
    private int rollNo;
    private String branch;
    public student123() {
        this.sName = "irfan";
        this.rollNo = 14;
        this.branch = "IOT";

    }
    public student123(String sName) {
        this();
        this.sName = sName;
    }
    student123(String sName,int rollNo,String branch){
        this(sName);
    }
    public String getsName() {
        return sName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getBranch() {
        return branch;
    }
    
    
}
public class constructorChaining {
    public static void main(String[] args){
        student123 s = new student123("irfan",14,"CSE");
        System.out.println(s.getsName());
        System.out.println(s.getRollNo());
        System.out.println(s.getBranch());
    }
}
