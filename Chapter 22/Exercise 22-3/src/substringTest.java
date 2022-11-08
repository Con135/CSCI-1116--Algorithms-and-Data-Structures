import java.util.Scanner;

public class substringTest {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string s1: ");
		String s1 = input.next();
		System.out.print("Enter a string s2: ");
		String s2 = input.next();
		
		int a1 = s1.length();
		int a2 = s2.length();
		int index = 0;
		int count2 = 0;
		
		if (s1.contains(s2) == true) {
			
			for (int count1 = 0; count1 < a1; count1++) {
				if (count2 + 1 != a2) {
					if (s1.charAt(count1) == s2.charAt(count2)) {
						if (count2 == 0) {
							index = count1;
						}
						count2++;
					}
					else {
						count2 = 0;
					}
				}
			}
			System.out.print("Matched at index: " + index);
		}
		else {
			System.out.print("The string s2 is not a substring of string s1.");
		}
	}
}