package userManagement;

public class Account {
	private int AccountID;
	private String name;
	private String username;
	private String type;
	public int getAccountID() {
		return AccountID;
	}
	public void setAccountID(int accountID) {
		AccountID = accountID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
