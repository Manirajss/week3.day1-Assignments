package org.system;

public class Desktop extends computer{
	public void desktopSize() {
		System.out.println("My desktop size is 19.57%");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSize();

	}

}
