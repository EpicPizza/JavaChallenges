package javaChallenges;

public class SimpleCalculatorClass {
	private double a; //declare a and b variables
	private double b;
	
	public static void main(String[] args) { //just intializes instance of SimpleCalculatorClass and runs all methods
		SimpleCalculatorClass calculate = new SimpleCalculatorClass(4, 5);
		System.out.println(calculate.add());
		calculate.setA(9);
		calculate.setB(3);
		System.out.println(calculate.substract());
		System.out.println(calculate.divide());
		System.out.println(calculate.multiply());
		System.out.println(calculate.getA());
		System.out.println(calculate.getB());
		
	}
	
	public SimpleCalculatorClass(double a, double b) { //intializes a and b variables
		this.a = a;
		this.b = b;
	}

	public void setA(double input) { //setter for a
		a = input;
	}
	
	public void setB(double input) { //setter for b
		b = input;
	}
	
	public double getA() { //getter for a
		return a;
	}
	
	public double getB() { //getter for b
		return b;
	}
	
	public double add() { //adds a and b
		return a + b;
	}
	
	public double substract() { //subtracts b by a
		return b - a;
	}
	
	public double multiply() { //multiplies a by  b
		return a * b;
	}
	
	public double divide() { //divides a by b
		return a / b;
	}
}
