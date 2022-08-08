package loops;

public class OddEven {

	public static void main(String[] args) {
		// cearte triangle as odd even number
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(2);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
