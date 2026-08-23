package Encapsulation;
class Student{
    private String sName;
    private int sRollNo;

    public void setsName(String sName) {
		this.sName = sName;
	}
    public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}
    public String getsName() {
		return sName;
	}
    public int getsRollNo() {
		return sRollNo;
	}
}
public class Day1 {
    public static void main(String[] args){
        Student s = new Student();
		s.setsName("Irfan");
		s.setsRollNo(14);
		System.err.println(s.getsName());
		System.out.println(s.getsRollNo());
    }
}
