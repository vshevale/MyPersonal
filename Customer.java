
public class Customer 
{
	private int CustomerID;
	private String FirstName;
	private String LastName;
	private String EmailID;
	private String ContactNo;
	private int DueAmount;

	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public int getDueAmount() {
		return DueAmount;
	}
	public void setDueAmount(int dueAmount) {
		DueAmount = dueAmount;
	}
}
