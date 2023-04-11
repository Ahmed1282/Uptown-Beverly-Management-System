package PropertyManagement;

public class Property {
	private int street_no;
	private String plot_no;
	private String block_no;
	private String type;
	private String area;
	private Boolean possession;
	public int getStreet_no() {
		return street_no;
	}
	public void setStreet_no(int street_no) {
		this.street_no = street_no;
	}
	public String getPlot_no() {
		return plot_no;
	}
	public void setPlot_no(String plot_no) {
		this.plot_no = plot_no;
	}
	public String getBlock_no() {
		return block_no;
	}
	public void setBlock_no(String block_no) {
		this.block_no = block_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Boolean getPossession() {
		return possession;
	}
	public void setPossession(Boolean possession) {
		this.possession = possession;
	}
	
}
