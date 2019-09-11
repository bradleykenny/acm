import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("PERFECTION OUTPUT");
		while(in.hasNext()) {
			int next = Integer.parseInt(in.next());
			if (next == 0) {
				break;
			}
			ArrayList<Integer> nextDivisors = calcDivisors(next);
			int total = 0;
			for (Integer i : nextDivisors) {
				total += i;
			}
			if (next == total) {
				System.out.printf("%5s  %5s%n", next, "PERFECT");
			} else if (next < total) {
				System.out.printf("%5s  %5s%n", next, "ABUNDANT");
			} else {
				System.out.printf("%5s  %5s%n", next, "DEFICIENT");
			}
		}
		System.out.println("END OF OUTPUT");
	}

	public static ArrayList<Integer> calcDivisors(int n) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int d = 1; d < n; d++) {
			if (n % d == 0) {
				temp.add(d);
			}
		}
		return temp;
	}
}