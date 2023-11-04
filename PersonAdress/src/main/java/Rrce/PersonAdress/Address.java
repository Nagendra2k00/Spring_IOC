package Rrce.PersonAdress;

public class Address {

	
	private String cityName;
	private int pincode;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", pincode=" + pincode + "]";
	}
	
}
