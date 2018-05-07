package Basic_Programs;

public class Prime_Nums {

	// Prime number - a number which is greater than 1 and divisible itself and 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		int status = 1;
		int num = 3;

		if (n >= 1) {
			System.out.println("First " + n + "primary nos are");
			System.out.println(2);
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}

			}

			if (status != 0) {
				System.out.println(num);
				i++;
			}
			status = 1;
			num++;
		}

	}
}



// *********** Another method *******************
/*
int flag = 0;

for (int i = 1; i <= 100; i++) {
    for (int j = 2; j < i; j++) {
        if (i % j == 0) {
            flag = 0;
            break;
        } else {
            flag = 1;
        }
    }
    if (flag == 1) {
        System.out.print(i + " ");
    }
}		

*/