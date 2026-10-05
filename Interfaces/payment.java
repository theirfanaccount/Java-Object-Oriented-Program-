package Interfaces;

interface PaymentGateWay{
	void transferMoney();
	void processPayment();
	default void ProcessTransaction() {//   JDK 8 features
		logMessege("initiate");
		logMessege("underProcess");
		logMessege("complete");
	}
	static void refundPayment() {			//   JDK 8 features
		logMessege("payment failed");
	}
	private static  void logMessege(String msg) {	//   JDK 9 features
		System.out.println("Payment gate way log[] "+msg);
	}
}
class phonePay implements PaymentGateWay{
	
	@Override
	public void processPayment() {
		System.out.println("phonePay is processing the money");
		
	}
	@Override
	public void transferMoney() {
		System.out.println("PhonePay is transfering the money");
	}
}
class googlePay implements PaymentGateWay{
	
	@Override
	public void processPayment() {
		System.out.println("googlePay is processing the money");
		
	}
	@Override
	public void transferMoney() {
		System.out.println("googlePay is transfering the money");
	}
}
class paytm implements PaymentGateWay{
	
	@Override
	public void processPayment() {
		System.out.println("paytm is processing the money");
		
	}
	@Override
	public void transferMoney() {
		System.out.println("paytm is transfering the money");
	}
}
class pay{
	void display(PaymentGateWay pg) {
		pg.processPayment();
		pg.transferMoney();
		pg.ProcessTransaction();
	}
}
public class payment {

	public static void main(String[] args) {
		phonePay pp =  new phonePay();
		googlePay gp =  new googlePay();
		paytm pt =  new paytm();
		pay p = new pay();
		p.display(pp);
		p.display(gp);
		p.display(pt);
		
		
	}

}
