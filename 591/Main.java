import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int setNum = 1;
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			in.nextLine();
			String nums = in.nextLine();
			String[] nums_spl = nums.split(" ");
			int[] nums_arr = new int[n];
			int total = 0;
			for (int i = 0; i < nums_spl.length; i++) {
				nums_arr[i] = Integer.parseInt(nums_spl[i]);
				total += nums_arr[i];
			}
			int[] absolute_dif = new int[n];
			int tow_size = total/n;
			int abs_total = 0;
			for (int i = 0; i < n; i++) {
				absolute_dif[i] = Math.abs(tow_size-nums_arr[i]);
				abs_total += absolute_dif[i];
			}
			int tow_moves = abs_total/2;

			System.out.println("Set #" + setNum);
			setNum++;
			System.out.println("The minimum number of moves is " + tow_moves + ".\n");
		}
	}
}
