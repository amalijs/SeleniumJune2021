package week3.day1Assig4;

public class Students {
	
	public void getStudentInfo(int studID) {
		System.out.println("The student id is" + " " + studID);
		
	}
	
	public void getStudentInfo(int studID, String studName) {
		
		System.out.println("The student id is" + " " + studID);
		System.out.println("The student Name is" + " " + studName);
	}

	public void getStudentInfo(String emailId, String phoneNum) {
		System.out.println("The student email id is" + " " + emailId);
		System.out.println("The student phone number is" + " " + phoneNum);
		
	}
	
	public static void main(String[] args) {
				Students std = new Students();
				std.getStudentInfo(100);
				std.getStudentInfo(100, "John Britto");
				std.getStudentInfo("britto.i1993@gmail.com", "9677166720");
		
	}

}
