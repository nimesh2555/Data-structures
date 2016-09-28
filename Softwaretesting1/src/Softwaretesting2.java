import java.util.Scanner;

public class Softwaretesting2 {

	public static void main(String[] args) {
		int arr1[] = { 100, 100, 100, 100, 100,100,100,100,100,100,1,2,100,199,200 };
		int arr2[] = {  100, 100, 100, 100, 100,1,2,100,199,200 , 100, 100, 100, 100, 100};
		int arr3[] = { 1, 2, 100, 199, 200,100, 100, 100, 100, 100,100,100,100,100,100, };
		int a, b, c;
		int s12, s13, s23;
		int m = 0;
		for (int i = 0; i < 15; i++) {
			

					a = arr1[i];
					b = arr2[i];
					c = arr3[i];
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

					}
					m++;
					System.out.println("Case : "+m);
					s12 = a + b;
					s23 = b + c;
					s13 = a + c;
					if ((s12 <= c) || (s23 <= a) || (s13 <= b)) {
						System.out.println(" a = " + a + " b = " + b + " c = " + c + " Not a triangle");

					} else {
						if ((a == b) && (b == c)) {
							System.out.println(" a = " + a + " b =" + b + " c =" + c + " Equilateral triangle");

						} else if ((a == b) && (b != c)) {
							System.out.println(" a = " + a + " b =" + b + " c =" + c + " Issoceles triangle");

						} else if ((a == c) && (b != c)) {
							System.out.println(" a = " + a + " b =" + b + " c =" + c + " Issoceles triangle");

						} else if ((b == c) && (a != c)) {
							System.out.println(" a = " + a + " b =" + b + " c =" + c + " Issoceles triangle");

						} else if ((a != b) && (b != c)) {
							System.out.println(" a = " + a + " b =" + b + " c =" + c + " Scalene triangle");

						}
					}
				}
			

		
	}
}
