package PropertyManagement;

public class OwnProperty {
	private int property_value;
	private Boolean isPaid;
	private String date_paid;
	public int getProperty_value() {
		return property_value;
	}
	public void setProperty_value(int property_value) {
		this.property_value = property_value;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	public String getDate_paid() {
		return date_paid;
	}
	public void setDate_paid(String date_paid) {
		this.date_paid = date_paid;
	}
}
