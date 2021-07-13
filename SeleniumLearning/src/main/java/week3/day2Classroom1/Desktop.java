package week3.day2Classroom1;

public class Desktop implements Software{
	
	public void desktopModel() {
		System.out.println("My desktop Model is Intel CORE i5 7th Gen");
		
	}

	
	public void softwareResources() {
		System.out.println("softwareResouces");
		
	}

	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}
	
public static void main(String[] args) {
	
	Desktop deskt = new Desktop();
	deskt.softwareResources();
	deskt.hardwareResources();
	deskt.desktopModel();
		

	}


}
