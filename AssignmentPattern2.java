package assignment.pattern.com;

public class AssignmentPattern2 {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++)
				if ((i == 1 || i == col) || (j == 1 || j == col))
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");

			System.out.println();

		}
	}
}
