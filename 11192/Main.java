/* ====================
UVa Problem #11192
Bradley Kenny, SID: 45209723
==================== */

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(new InputStreamReader(System.in));

		int n = in.nextInt();

		while (n != 0) {
			String line = in.next();

			int length = line.length();
			int groupLen = length/n;
			String answer = "";

			for (int i = 0; i < groupLen; i++) {
				StringBuilder sb = new StringBuilder(line.substring(i*n, i*n+n));
				sb = sb.reverse();
				answer += sb;
			} System.out.println(answer);

			n = in.nextInt();
		}
	}
}
