import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Bill 
{
	private int customerID;
	private int billID;
	private Date billDate;
	private double totalDimention;
	private double rate;
	private double billAmount;
	private double paidAmount;
	private double dueAmount;
	private List<Dimension> dimensions = new ArrayList<Dimension>(); 

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getBillID() {
		return billID;
	}
	public void setBillID(int billID) {
		this.billID = billID;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public double getTotalDimention() {
		return totalDimention;
	}
	public void setTotalDimention(double totalDimention) {
		this.totalDimention = totalDimention;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public double getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}
	public List<Dimension> getDimensions() {
		return dimensions;
	}
	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
	}
}
