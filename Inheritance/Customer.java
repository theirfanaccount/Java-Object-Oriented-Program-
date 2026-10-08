package Inheritance;


class person1{
	String name;
	int age;
	String address;
	String phoneNumber;
	person1(){
		
	}
	public person1(String name,int age,String address,String phoneNumber){
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
	}
	void dispPersonDetails() {
		System.out.println("---Person Details---");
		System.out.println("Name "+name);
		System.out.println("age "+age);
		System.out.println("address "+address);
		System.out.println("phoneNumber "+phoneNumber);
		System.out.println();
	}
}
class customer1 extends person1{
	String customerId;
	String registrationDate;
	public customer1(String name,int age,String address,String phoneNumber){
		super(name,age,address,phoneNumber);
		this.customerId = "1234";
		this.registrationDate = "08-10-2007";
	}
	customer1(){
		
	}
	
	void dispCustomerDetails() {
		System.out.println("---Coustmer Details---");
		System.out.println("Coustmer Name "+name);
		System.out.println("Coustmer age "+age);
		System.out.println("Coustmer address "+address);
		System.out.println("Coustmer phoneNumber "+phoneNumber);
		System.out.println("Customer Id "+customerId);
		System.out.println("Registration date "+registrationDate);
		System.out.println();
	}
}
class premiumCustomer1 extends customer1{
	int rewardPoints;
	String premiumBenifit;
	double discountPercentage;
	
	public premiumCustomer1(String name,int age,String address,String phoneNumber){
		super(name,age,address,phoneNumber);
		this.rewardPoints = 1000;
		this.premiumBenifit = "Extra sevises";
		this.discountPercentage = 20.5;
		
		
	}
	
	
	void dispPremiumCoustomerDetails() {
		System.out.println("---Premium Coustmer Details---");
		System.out.println("Premium Coustmer Name "+name);
		System.out.println("Premium Coustmer age "+age);
		System.out.println("Premium Coustmer address "+address);
		System.out.println("Premium Coustmer phoneNumber "+phoneNumber);
		System.out.println("Premium Customer RewardPoints "+rewardPoints);
		System.out.println("Premium Customer premium Benifits "+premiumBenifit);;
		System.out.println("Premium Customer Discount Percentage "+discountPercentage);
	}
//	super.dispDetails();
}
public class Customer {

	public static void main(String[] args) {
		person1 p = new person1();
		customer1 c = new customer1();
		premiumCustomer1 pc = new premiumCustomer1("Irfan",18,"patna","7321939626");
		pc.dispPersonDetails();
		pc.dispCustomerDetails();
		pc.dispPremiumCoustomerDetails();
		

	}

}

