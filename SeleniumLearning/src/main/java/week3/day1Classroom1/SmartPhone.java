package week3.day1Classroom1;

public class SmartPhone extends AndroidPhone{

	public void connectWhatsApp() {
		System.out.println("Connect via whatsapp in Smartphone");
	}
	public void takeVideo() {
		System.out.println("Take a video with 10pixels in Smartphone");
	}

	public static void main(String[] args) {
		SmartPhone andphe = new SmartPhone();
		andphe.takeVideo();
	
	}
}
