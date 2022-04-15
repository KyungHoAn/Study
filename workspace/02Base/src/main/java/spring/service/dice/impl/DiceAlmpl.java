package spring.service.dice.impl;

import java.util.Random;
import spring.service.dice.Dice;
public class DiceAlmpl implements Dice{
	private int value;
	public DiceAlmpl() {
		// TODO Auto-generated constructor stub
		System.out.println("::"+getClass().getName()+"»ý¼ºÀÚ...");
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value=value;
	}
	
	public void selectedNumber() {
		value = new Random().nextInt(6)+1;
		}

}
