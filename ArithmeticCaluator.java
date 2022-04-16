package Simplilearn.Phase1VirtualClassCurriculum;

import java.util.Scanner;

public class ArithmeticCaluator {

	static Scanner sc = new Scanner(System.in);

	private static boolean calculator(double a, double b) {
		boolean appRun = true;
		while (appRun) {
			System.out.println(
					"\nEnter '+' for Addition || '-' for Subtraction || '*' for Multiplication || '/' for Diviaion ");
			System.out.println("'<' to move to Main MENU || Enter any other key to 'EXIT' :-");
			char c = sc.next().charAt(0);
			switch (c) {
			case '+':
				System.out.println("Result : " + (a + b));
				break;
			case '-':
				System.out.println("Result : " + (a - b));
				break;
			case '*':
				System.out.println("Result : " + (a * b));
				break;
			case '/':
				System.out.println("Result : " + (a / b));
				break;
			case '<':
				appRun = false;
				break;

			default:
				System.out.println("\nTurninig OFF the calculator... ");
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;

		boolean appRun = true;

		while (appRun) {
			try {
				System.out.println("Enter the 1st number: ");
				a = sc.nextDouble();
				System.out.println("Enter the 2nd number: ");
				b = sc.nextDouble();
				appRun = calculator(a, b);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Incorrect input :(");
				break;
			}

		}

	}

}
