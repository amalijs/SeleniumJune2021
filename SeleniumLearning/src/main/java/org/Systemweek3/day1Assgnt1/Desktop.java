package org.Systemweek3.day1Assgnt1;

public class Desktop extends Computer{
	public static void desktopSize() {
		System.out.println("Desktop size is 100% (Recommended");
	}

	public static void main(String[] args) {
		Computer cmp = new Computer();
		cmp.computerModel();
		desktopSize();
	
		
	}

}
