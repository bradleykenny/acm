import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int numLines = Integer.parseInt(in.nextLine());

			if (numLines == 0) {
				break;
			}

			String[] images = new String[numLines];
			for (int i = 0; i < numLines; i++) {
				images[i] = in.nextLine();
			}

			int[] numX = new int[numLines];
			int max = 0;
			for (int i = 0; i < numLines; i++) {
				numX[i] = numX(images[i]);
				if (numX[i] > max) {
					max = numX[i];
				}
			}

			int count = 0;
			for (int num : numX) {
				count += max - num;
			}

			System.out.println(count);
		} in.close();
	}

	public static int numX(String data) {
		if (data.length() == 0) {
			return 0;
		}
		
		if (data.charAt(0) == 'X') {
			return 1 + numX(data.substring(1));
		} else {
			return 0 + numX(data.substring(1));
		}
	}
}