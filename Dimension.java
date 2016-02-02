
public class Dimension 
{
	private int dimensionID;
	private int billID;
	private double value1;
	private double value2;
	private double CalculatedValue;

	public int getDimensionID() {
		return dimensionID;
	}
	public void setDimensionID(int dimensionID) {
		this.dimensionID = dimensionID;
	}
	public int getBillID() {
		return billID;
	}
	public void setBillID(int billID) {
		this.billID = billID;
	}
	public double getValue1() {
		return value1;
	}
	public void setValue1(double value1) {
		this.value1 = value1;
	}
	public double getValue2() {
		return value2;
	}
	public void setValue2(double value2) {
		this.value2 = value2;
	}
	public double getCalculatedValue() {
		return CalculatedValue;
	}
	public void setCalculatedValue(double calculatedValue) {
		CalculatedValue = calculatedValue;
	}
}
