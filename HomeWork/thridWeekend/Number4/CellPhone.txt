package Weekend03_3;

public class CellPhone {
	private String model;	//핸드폰 모델번호
	private double battery; //남은 배터리 양

	public CellPhone() {
		super();
	}
	public CellPhone(String model) {
		this.model = model;
	}
	
	//통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다.
	public void call(int time) {
		System.out.println("통화시간:"+time+"분");
		this.battery -= (double)time*0.5;
		if(battery <0) {
			try {
				
			}catch(IllegalArgumentException e) {
				e.printStackTrace();
			}
			this.battery =0;
		}
	}
	//충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리양을 증가시킨다.
	public void charge(int time) {
		System.out.println("충전시간:"+time+"분");
		this.battery += (double)time*3;
		
		if(battery>100) {
			this.battery = 100;
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양:"+this.battery);
	}
	
	public boolean equals(Object otherObject) {
		return false;
	}
	
	//////////////////////////////////////////////	
	//////////////////////////////////////////////	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	//////////////////////////////////////////////
	public void setBattery(double battery) {
		this.battery = battery;
	}
	public double getBattery() {
		return battery;
	}

}
