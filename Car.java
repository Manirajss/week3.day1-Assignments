package week3.day1;

public class Car extends Vehicle {
	public void bMW() {
		System.out.println("Testing BMW car");
	}
	public void audi() {
		System.out.println("Testing Audi car");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.bMW();
		obj.applyBreak();
		obj.soundHorn();
		obj.audi();
		obj.applyBreak();
		obj.soundHorn();
	}

}
