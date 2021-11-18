package demoOOP;

public class Customer {
String customerName;
String customerType;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerType() {
	return customerType;
}
public void setCustomerType(String customerType) {
	this.customerType = customerType;
}
public Customer(String customerName, String customerType) {
	super();
	this.customerName = customerName;
	this.customerType = customerType;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerType=" + customerType + "]";
}

}
