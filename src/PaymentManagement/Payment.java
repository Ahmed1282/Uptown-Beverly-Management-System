package PaymentManagement;

public class Payment {
	private int Amount;
	private String date;
	private Boolean status;
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
