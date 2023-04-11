package userManagement;

public class Customer {
private String CNIC;
private String email;
private String phone;
private String address;

public String getCNIC() {
	return CNIC;
}
public void setCNIC(String cNIC) {
	CNIC = cNIC;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
