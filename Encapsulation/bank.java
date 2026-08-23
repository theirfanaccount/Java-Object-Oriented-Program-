package Encapsulation;

public class bank {
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
