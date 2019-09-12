import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			int numRowCol = in.nextInt();
			int[][] rows = new int[numRowCol][numRowCol];
			for (int i = 0; i < numRowCol; i++) {
				String temp = in.nextLine();
				int j = 0;
				for (String str : temp.split("\\s+")) {
					rows[i][j] = Integer.parseInt(str);
				}
			}

			
		} in.close();
	}
}