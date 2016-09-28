
public class Softwaretesting3 {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 2, 100, 199, 200, 201 };
		int a, b, c;
		int s12, s13, s23;
		int m = 0;
		int flag = 0;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				for (int k = 0; k < 7; k++) {
					flag = 0;
					a = arr[i];
					b = arr[j];
					c = arr[k];
					m++;
					if (m % 27 == 0) {
						System.out.println("Case :" + m);
						if ((a < 1) || (a > 200) || ((b < 1) || (b > 200)) || (c < 1) || (c > 200)) {
							System.out.println(" a = " + a + " b = " + b + " c = " + c);
							if ((a < 1) || (a > 200)) {
								System.out.println("Value of side a is out of range " + a);
								flag = 1;
							}
							if ((b < 1) || (b > 200)) {
								System.out.println("Value of side b is out of range " + b);
								flag = 1;
							}
							if ((c < 1) || (c > 200)) {
								System.out.println("Value of side c is out of range " + c);
								flag = 1;
							}

						}

						if (flag == 0) {
							s12 = a + b;
							s23 = b + c;
							s13 = a + c;
							if ((s12 <= c) || (s23 <= a) || (s13 <= b)) {
								System.out.println(" a = " + a + " b = " + b + " c = " + c + " Not a triangle");

							} else {
								if ((a == b) && (b == c)) {
									System.out
											.println(" a = " + a + " b = " + b + " c = " + c + " Equilateral triangle");

								} else if ((a == b) && (b != c)) {
									System.out.println(" a = " + a + " b = " + b + " c = " + c + " Issoceles triangle");

								} else if ((a == c) && (b != c)) {
									System.out.println(" a = " + a + " b =" + b + " c = " + c + " Issoceles triangle");

								} else if ((b == c) && (a != c)) {
									System.out.println(" a = " + a + " b = " + b + " c = " + c + " Issoceles triangle");

								} else if ((a != b) && (b != c)) {
									System.out.println(" a = " + a + " b = " + b + " c = " + c + " Scalene triangle");

								}
							}
						}
					}
				}
			}
		}
	}
}
