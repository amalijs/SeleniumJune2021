package week3.day1ClassRoom2;

public class Calculator {
	
	public void add(int num1, int num2) {
		//2 methods for add, 1 method with 2 int args , 1 method with 3 int args
		System.out.println(num1+num2 +" " + "adding two values");
	}
	
	public void add(int num1, int num2, int num3) {
		//2 methods for add, 1 method with 2 int args , 1 method with 3 int args
				System.out.println(num1+num2+num3 + " " + "Adding three values");
	}
	
	public void multiply(int num1, int num2) {
		//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
		System.out.println(num1*num2 + " " + "Mulitplying two numbers");
		
	}
	
	public void multiply(int num1, double num2) {
		//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
		System.out.println(num1*num2  +  " " + "Mulitplying two numbers, but different datatype");
		
	}
	
	public void subtract(int num1, int num2) {
		//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
		System.out.println(num1-num2 + " " + "Subtracting two numbers");
	}
	
	public void subtract(int num1, double num2) {
		//- 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args
		System.out.println(num1-num2  + " " +"Subtracting two numbers");
	}
	
	public void divide(int num1, int num2) {
		//- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
		System.out.println(num1/num2 + " " +"divding two numbers");
	}
	public void divide(double num1, int num2) {
		//- 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
		System.out.println(num1/num2 + " " +"divding two numbers");
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(5, 10);
		calc.add(5, 10, 15);
		
		calc.multiply(3, 6);
		calc.multiply(5, 10.7);
		
		calc.subtract(4, 2);
		calc.subtract(10, 4.3);
		
		calc.divide(15, 2);
		calc.divide(20.3, 5);

	}

}
