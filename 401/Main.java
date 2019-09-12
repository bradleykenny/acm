import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {
	public static HashMap<Character, Character> mirrorChars = createMirrors();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			String temp = in.nextLine();
			
			boolean mirror = isMirror(temp);
			boolean palindrome = isPalindrome(temp);

			if (mirror && palindrome) {
				System.out.println(temp + " -- is a mirrored palindrome.\n");
			} else if (mirror) {
				System.out.println(temp + " -- is a mirrored string.\n");
			} else if (palindrome) {
				System.out.println(temp + " -- is a regular palindrome.\n");
			} else {
				System.out.println(temp + " -- is not a palindrome.\n");
			}
		} in.close();
	}

	public static HashMap<Character, Character> createMirrors() {
		HashMap<Character, Character> mirrorChars = new HashMap<>();
		mirrorChars.put('A', 'A');
		mirrorChars.put('3', 'E');
		mirrorChars.put('H', 'H');
		mirrorChars.put('I', 'I');
		mirrorChars.put('L', 'J');
		mirrorChars.put('J', 'L');
		mirrorChars.put('M', 'M');
		mirrorChars.put('O', 'O');
		mirrorChars.put('2', 'S');
		mirrorChars.put('T', 'T');
		mirrorChars.put('U', 'U');
		mirrorChars.put('V', 'V');
		mirrorChars.put('W', 'W');
		mirrorChars.put('X', 'X');
		mirrorChars.put('Y', 'Y');
		mirrorChars.put('5', 'Z');
		mirrorChars.put('1', '1');
		mirrorChars.put('S', '2');
		mirrorChars.put('E', '3');
		mirrorChars.put('Z', '5');
		mirrorChars.put('8', '8');
		return mirrorChars;
	}

	public static boolean isMirror(String data) {
		if (data.length() == 0 || data == null) {
			return true;
		}

		if (data.length() > 1) {
			if (!mirrorChars.containsKey(data.charAt(data.length() - 1))) {
				return false;
			}
			if (data.charAt(0) == mirrorChars.get(data.charAt(data.length() - 1))) {
				return isMirror(data.substring(1, data.length() - 1));
			}
		} else {
			if (mirrorChars.containsKey(data.charAt(0))) {
				return (data.charAt(0) == mirrorChars.get(data.charAt(data.length() - 1)));
			}
		}
		
		return false;
	}

	public static boolean isPalindrome(String data) {
		if (data.length() <= 1) {
			return true;
		}

		if (data.charAt(0) == data.charAt(data.length() -1)) {
			return isPalindrome(data.substring(1, data.length() - 1));
		}

		return false;
	}
}