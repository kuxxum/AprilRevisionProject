package basic;

public class MaxCharinString {
	    public static void main(String[] args) {
	        String str = "hihowareyou";
	        int[] count = new int[256]; // An array to store the count of each character

	        // Traverse the string and count the occurrence of each character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            count[c]++;
	        }

	        // Find the character with maximum occurrence
	        int maxCount = 0;
	        char maxChar = ' ';
	        for (int i = 0; i < count.length; i++) {
	            if (count[i] > maxCount) {
	                maxCount = count[i];
	                maxChar = (char) i;
	            }
	        }

	        System.out.println("The maximum occurring character in the string \"" + str + "\" is '" + maxChar + "' with a count of " + maxCount + ".");
	    }
	}



