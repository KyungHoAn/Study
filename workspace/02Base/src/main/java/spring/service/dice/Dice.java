package spring.service.dice;

public interface Dice {
	public int getValue();
	
	//==> 주사위를 던져 선택되는 숫자를 생산하는 method declaration
	public void selectedNumber();
}
