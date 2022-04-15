package spring.service.dice.impl;

import java.util.Random;

import spring.service.dice.Dice;
public class DiceClmpl {
	private int value;
	public DiceClmpl() {
		// TODO Auto-generated constructor stub
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void selectedNumber() {
		value = new Random().nextInt(6)+1;
	}
}
