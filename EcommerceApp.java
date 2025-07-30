class PaymentGateway{
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Method of payment:credit card payment");
		System.out.println("processing...");
	}
	public void makePayment(String UPIid) {
		System.out.println("Method of payment:UPI payments");
		System.out.println("processing...");
	}
	public void makepayment(double amount) {
		System.out.println("Method of payment:cash on delivery");
		System.out.println("processing...");
	}
}
public class EcommerceApp {
	public static void main(String[] args) {
		PaymentGateway pay=new PaymentGateway();
		pay.makePayment("#345*","4/9/2026","&23");
		pay.makePayment("asdf#");
		pay.makepayment(12000.4);
	}

}
