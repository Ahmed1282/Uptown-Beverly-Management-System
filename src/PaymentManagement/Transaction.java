package PaymentManagement;

public class Transaction {
	private int Amount;
	private String Date;
	private String Payment_type;
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getPayment_type() {
		return Payment_type;
	}
	public void setPayment_type(String payment_type) {
		Payment_type = payment_type;
	}
}
