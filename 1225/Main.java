import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numInputs = in.nextInt();
		for (int i = 0; i < numInputs; i++) {
			int next = in.nextInt();
			String temp = "";
			for (int j = 1; j <= next; j++) {
				temp += j;
			}

			for (int k = 0; k < 10; k++) {
				if (k != 9) {
					System.out.print(numNums(temp, k) + " ");
				} else {
					System.out.print(numNums(temp, k) + "\n");
				}
			}
		}
	}

	public static int numNums(String data, int num) {
		if (data.isEmpty()) {
			return 0;
		}

		if (Integer.parseInt(data.substring(0, 1)) == num) {
			return 1 + numNums(data.substring(1), num);
		} return numNums(data.substring(1), num);
	} 
}