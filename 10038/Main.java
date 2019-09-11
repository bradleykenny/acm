/* ====================
UVa Problem #10038
Bradley Kenny, SID: 45209723
==================== */

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(new InputStreamReader(System.in));

		String nums = in.nextLine();
		String[] nums_split = nums.split("\\s");
		int[] nums_arr = new int[nums_split.length];

		for (int i = 0; i < nums_arr.length; i++) {
			nums_arr[i] = Integer.parseInt(nums_split[i]);
		}

		int[] diff = new int[nums_arr.length - 1];
		for (int i = 0; i < nums_arr.length - 1; i++) {
			diff[i] = nums_arr[i] - nums_arr[i+1];
			System.out.print(diff[i] + ", ");
		}
	}
}
