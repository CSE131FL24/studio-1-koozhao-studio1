package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Tell me a year: ");
		int n1 = in.nextInt();
		boolean div4 = n1 % 4 == 0;
		boolean div100 = n1 % 100 != 0;
		boolean div400 = n1 % 400 == 0;
		boolean LeapYear = div400 || (div4 && div100);
		System.out.println(n1 + " is a leap Year: " + LeapYear);
	}

}
