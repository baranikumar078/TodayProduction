package org.pc;

public class Desktop extends Computer {
       
	private void deskTopSize() {
	System.out.println("Desktop size is 15.6inch(40cm)");
	
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.deskTopSize();
		d.computerModel();
	}
}
