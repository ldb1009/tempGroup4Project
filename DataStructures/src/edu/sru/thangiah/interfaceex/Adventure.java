package edu.sru.thangiah.interfaceex;

/*
 *  Interface class
 */

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println("Can fight");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
		System.out.println("Can swim");
	}

	public void fly() {
		System.out.println("Can fly");
	}
}

public class Adventure {
	public static void main(String[] args) {
		Hero superMan = new Hero();
		superMan.fight();
		superMan.swim();
		superMan.fly();
	}
}
