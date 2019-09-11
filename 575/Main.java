import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String line = in.nextLine();
			if (line.equals("0")) {
				break;
			}

			System.out.println(getValue(line));
		}
	}

	public static int getValue(String num) {
		if (num.isEmpty()) {
			return 0;
		}

		return Integer.parseInt(num.substring(0, 1)) * (int)(Math.pow(2, num.length()) - 1) + getValue(num.substring(1));
	}
}