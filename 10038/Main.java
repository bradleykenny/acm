import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String[] s = in.nextLine().split("\\s+");
			int[] seq = new int[s.length - 1];
			if (seq.length <= 1) {
				System.out.println("Jolly");
			} else {
				for (int i = 0; i < seq.length; i++) {
					seq[i] = Math.abs(Integer.parseInt(s[i]) - Integer.parseInt(s[i+1]));
					System.out.print(seq[i] + " ");
				}
				
				HashMap<Integer, Boolean> temp = new HashMap<>();
				for (int i = 1; i < s.length; i++) {
					temp.put(i, false);
				}

				for (int i : seq) {
					if (temp.containsKey(i)) {
						temp.replace(i, true);
					}
				}

				boolean jolly = true;
				for (int i : temp.keySet()) {
					if (!temp.get(i)) {
						jolly = false;
					}
				}

				if (jolly) {
					System.out.println("Jolly");
				} else {
					System.out.println("Not jolly");
				}
			}
		}
		in.close();
	} 
}
