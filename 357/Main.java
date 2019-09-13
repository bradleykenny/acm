import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			HashMap<Integer, ArrayList<Integer>> table = new HashMap<>();
			int[] ways = { 1, 5, 10, 25, 50 };
		}
	}

	public static ArrayList<Integer> waysToGet(int total, int[] ways) {
		if (ways.length == 0) {
			return null;
		}

		for (int way : ways) {
			if (total - way > -1) {
				return waysToGet(total, ways);
			} else {
				return null;
			}
		} return null;
	}
}