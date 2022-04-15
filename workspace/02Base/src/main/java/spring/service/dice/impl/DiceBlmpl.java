package spring.service.dice.impl;

import java.util.Random;
import spring.service.dice.Dice;
public class DiceBlmpl implements Dice{
	
	private int value;
	

	public DiceBlmpl() {
		System.out.println("::"+getClass().getName()+"»ý¼ºÀÚ...");
		// TODO Auto-generated constructor stub
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue() {
		this.value = value;
	}
	public void selectedNumber() {
		value = new Random().nextInt(6)+1;
	}

}
