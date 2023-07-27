package assignment.pattern.com;

public class AssignmentPattern3 {

	public static void main(String[] args) {
		int rows = 3;
		int i, j, k;
		i = 1;
		while (i <= rows) {
			j = i;
			while (j < rows) {
				System.out.print(" ");
				j++;
			}
			k = 1;
			while (k < 2 * i) {
				if (i == rows || (k == 1 || k == 2 * i - 1))
					System.out.print("*");
				else
					System.out.print(" ");
				k++;
			}
			i++;
			System.out.print("\n");
		}
	}

}
