package Encapsulation;
class myBank{
    private String name;
    private int accNo;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getAccNo() {
        return accNo;
    }
    public double getBalance() {
        return balance;
    }
}

    
    
public class bank {
    public static void main(String[] args){
        myBank b = new myBank();
        b.setName("Irfan");
        b.setAccNo(123456);
        b.setBalance(1000.50);
        System.out.println("Account Holder: " + b.getName());
        System.out.println("Account Number: " + b.getAccNo());
        System.out.println("Account Balance: $" + b.getBalance());
    }
}
