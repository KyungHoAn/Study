package thridWeekend;


public class SmartPhone extends CellPhone{
	boolean isMonthlyFixedRate; //월정액 요금제 유무
	int monthlyFixedFee;	//월정액요금
	
	public SmartPhone() {
		super();
	}
	public SmartPhone(String phoneNumber, int feePerCallTime) {
		super.setPhoneNumber(phoneNumber);
		this.setFeePerCallTime(feePerCallTime);
	}
	public SmartPhone(String phoneNumber,int feePerCallTime, boolean isMonthlyFixedRate, int monthlyFixedFee) {
		super.setPhoneNumber(phoneNumber);
		super.setFeePerCallTime(feePerCallTime);
		this.isMonthlyFixedRate = isMonthlyFixedRate;
		this.monthlyFixedFee = monthlyFixedFee;
	}
	public void call(String phoneNumber, int totalCall) {
		//System.out.println(phoneNumber+" 번호로"+totalCall+" 통화함");
		super.call(phoneNumber, totalCall);
	}
	public void calculateTotalFee() {
		System.out.println("고객님은"+this.monthlyFixedFee+" 정액 요금제입니다.");
	}
	
	public void setisMonthlyFixedRate(boolean isMonthlyFixedRate) {
		this.isMonthlyFixedRate = isMonthlyFixedRate;
	}
	public boolean getisMonthlyFixedRate() {
		return isMonthlyFixedRate;
	}
	public void setmonthlyFixedFee(int monthlyFixedFee) {
		this.monthlyFixedFee = monthlyFixedFee;
	}
	public int getmonthlyFixedFee() {
		return monthlyFixedFee;
	}
	public int getTotalFee() {
		return monthlyFixedFee;
	}
	
}//end of class
