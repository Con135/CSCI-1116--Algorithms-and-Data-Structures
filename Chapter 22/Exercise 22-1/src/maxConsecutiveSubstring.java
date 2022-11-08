import java.util.Scanner;

public class maxConsecutiveSubstring {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = input.next();
		
		int a = string.length();
		int longestLength = 0;
		int newLongestLength = 0;
		int longestLengthStart = 0;
		
		for (int count1 = 0; count1 < a; count1++) {
			for (int count2 = count1; count2 < a; count2++) {

				if(count2 + 1 != a) {
					
					if (string.charAt(count2) < string.charAt(count2 + 1)) {
						newLongestLength++;
					}
					else {
						
						if (newLongestLength > longestLength) {
							longestLength = newLongestLength;
							longestLengthStart = count1;
						}
						newLongestLength = 0;
					}
				}
			}
		}
		System.out.print("Mamimum consecutive substring is ");
		for(int count3 = longestLengthStart; count3 < longestLength + 1; count3++) {
			System.out.print(string.charAt(count3));
		}
	}
}