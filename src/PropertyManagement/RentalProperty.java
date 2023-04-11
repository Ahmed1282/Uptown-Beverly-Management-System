package PropertyManagement;

public class RentalProperty {
	private int rent_payment;
	private String month;
	private int year;
	private Boolean isPaid;
	public int getRent_payment() {
		return rent_payment;
	}
	public void setRent_payment(int rent_payment) {
		this.rent_payment = rent_payment;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

}
