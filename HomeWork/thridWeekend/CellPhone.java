package homework;


public class CellPhone {
	private String phoneNumber;
	private int totalCallTime;		//전화사용시간
	private int totalFee;			//사용요금
	private int feePerCallTime;	//단가 - 시간단 사용요금
	
	public CellPhone() {
		super();
	}
	public CellPhone(String phoneNumber, int feePerCallTime) {
		this.phoneNumber = phoneNumber;
		this.feePerCallTime = feePerCallTime;
	}
	public void call(String phoneNumber, int totalCallTime) {
		System.out.println(phoneNumber+"번호로 "+totalCallTime+"분 통화함");
		this.totalCallTime += totalCallTime;
	}
	public void calculateTotalFee() {
		this.totalFee = this.feePerCallTime*this.totalCallTime;
	}	
//////////////////////////////////////////////////////////////////////////
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
////////////////////////////////////////////////////////////////////////
	public int getTotalCallTime() {
		return totalCallTime;
	}
	public void setTotalCallTime(int totalCallTime) {
		this.totalCallTime = totalCallTime;
	}
////////////////////////////////////////////////////////////////////////
	public int getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}
////////////////////////////////////////////////////////////////////////
	public int getFeePerCallTime() {
		return feePerCallTime;
	}
	public void setFeePerCallTime(int feePerCallTime) {
		this.feePerCallTime = feePerCallTime;
	}
}
