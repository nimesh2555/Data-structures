import java.util.Scanner;

public class Softwaretesting1 {

	public static void main(String[] args) {
		int a, b, c;
		int s12, s13, s23;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of side a  ");
		a = sc.nextInt();
		System.out.println("Enter Value of side b ");
		b = sc.nextInt();
		System.out.println("Enter Value of side c ");
		c = sc.nextInt();
		if ((a < 1) || (a > 200) || ((b < 1) || (b > 200)) || (c < 1) || (c > 200)) {
			if ((a < 1) || (a > 200)) {
				System.out.println("Value of side a is out of range ");
			}
			if ((b < 1) || (b > 200)) {
				System.out.println("Value of side b is out of range ");
			}
			if ((c < 1) || (c > 200)) {
				System.out.println("Value of side c is out of range ");
			}
			System.exit(0);
		}
		s12 = a + b;
		s23 = b + c;
		s13 = a + c;
		if ((s12 <= c) || (s23 <= a) || (s13 <= b)) {
			System.out.println("Not a triangle");
		} else {
			if ((a == b) && (b == c)) {
				System.out.println("Equilateral triangle");
			} else if ((a == b) && (b != c)) {
				System.out.println("Issoceles triangle");
			} else if ((a == c) && (b != c)) {
				System.out.println("Issoceles triangle");
			} else if ((b == c) && (a != c)) {
				System.out.println("Issoceles triangle");
			} else if ((a != b) && (b != c)) {
				System.out.println("Scalene triangle");
			}
		}

	}

}
