package org.pc;

public class Desktoop implements Software, Hardware {
       private void desktopModel() {
	System.out.println("Desktop model is Hp 15g br 104tx");}

	@Override
	public void hardwareResources() {
	 System.out.println("Keyboard,mouse");}

	@Override
	public void softwareResources() {
		System.out.println("cpu,video card");
	}
     public static void main(String[] args) {
		Desktoop d=new Desktoop();
		d.softwareResources();
		d.desktopModel();
		d.hardwareResources();
	}  
       
}
