import java.lang.*;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {

			// READING

			String tempCoeff = in.nextLine();
			String tempTerms = in.nextLine();

			// PARSING

			ArrayList<Integer> coeffs = new ArrayList<Integer>();
			String[] splitCoeff = tempCoeff.split("\\s+");
			for (int i = splitCoeff.length - 1; i >= 0; i--) {
				coeffs.add(Integer.parseInt(splitCoeff[i]));
			}

			ArrayList<Integer> terms = new ArrayList<Integer>();
			for (String str : tempTerms.split("\\s+")) {
				terms.add(Integer.parseInt(str));
			}

			// CALCULATING

			List<BigInteger> result = new ArrayList<BigInteger>();
			for (int i = 0; i < terms.size(); i++) {
				BigInteger temp = new BigInteger("0");
				for (int j = 0; j < coeffs.size(); j++) {
					temp = temp.add(BigInteger.valueOf((long)Math.pow(terms.get(i), j)).multiply(BigInteger.valueOf((long)coeffs.get(j))));
				} result.add(temp);
			}

			// PRINTING

			for (int i = 0; i < result.size(); i++) {
				if (i == result.size() - 1) {
					System.out.print(result.get(i) + "\n");
				} else {
					System.out.print(result.get(i) + " ");
				} 
			} 
		} in.close();
	}
}