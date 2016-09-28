
public class Softwaretesting4 {

	public static void main(String[] args) {

		int dd[] = { 1, 2, 15, 30, 31 };
		int mm[] = { 1, 2, 6, 11, 12 };
		int yy[] = { 1812, 1813, 1912, 2011, 2012 };
		int c = 0, d, m, y;
		int flag = 0;
		int iv = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {

					d = dd[j];
					m = mm[i];
					y = yy[k];
					c++;

					int td = d, tm = m, ty = y;

					flag = 0;
					iv = 0;
					if (c % 12 == 0) {

						if ((d < 1) || (d > 31) || (m < 1) || (m > 12) || (y < 1812) || (y > 2012)) {
							if ((d < 1) || (d > 31)) {
								System.out.println("Day value: " + d + " is not wihin range 1-31");
							}
							if ((m < 1) || (m > 12)) {
								System.out.println("Month value: " + m + " is not wihin range 1-12");
							}
							if ((y < 1812) || (y > 2012)) {
								System.out.println("Year value: " + y + " is not wihin range 1812-2012");
							}
							flag = 1;
						}

						if (flag == 0) {
							if ((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10)) {
								if (d < 31) {
									td = d + 1;
								} else {
									td = 1;
									tm = tm + 1;
								}
							}
							if ((m == 4) || (m == 6) || (m == 9) || (m == 11)) {
								if (d < 30) {
									td = d + 1;
								} else if (d == 30) {
									td = 1;
									tm = tm + 1;
								} else {
									iv = 1;
								}
							}
							if (m == 12) {
								if (d < 31) {
									td = d + 1;
								} else {
									td = 1;
									tm = 1;
									if (y == 2012) {
										iv = 1;
									} else {
										ty = ty + 1;
									}
								}

							}
							if (m == 2) {
								if (d < 28) {
									td = d + 1;
								} else {
									if (d == 28) {
										if (y % 4 == 0) {
											td = d + 1;
										} else {
											td = 1;
											tm = m + 1;
										}
									} else if (d == 29) {
										if (y % 4 == 0) {
											td = 1;
											tm = m + 1;
										} else {
											iv = 1;
										}
									} else if (d > 29) {
										iv = 1;
									}

								}
							}
							
							if (iv == 0) {
								System.out.println("Case : "+c+" Month : "+m+" Day : "+d+" Year : "+y+"  Expected output :"+tm+" , "+td+" , "+ty);
							} else {
								System.out.println("Case : "+c+" Month : "+m+" Day : "+d+" Year : "+y+ " Invaild Date");
							}
						}
						
						
						
						
						
						
						
					}
				}
			}
		}
	}
}
