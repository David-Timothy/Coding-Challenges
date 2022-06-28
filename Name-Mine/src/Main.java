import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tests = pickInt("How many tests : ");
		while(tests > 0) {
			System.out.println(
					compatable(getUserInput("Name 1 : "), getUserInput("Name 2 : "))
					);
			tests--;
		}
	}
	
	static String compatable(String s1, String s2) {
		if( subSequence(s1, s2) || subSequence(s2, s1) )
			return "YES";
		else
			return "NO";
	}

	static boolean subSequence(String superString, String subString) {
		superString = superString.toLowerCase();
		subString = subString.toLowerCase();
		int subIndex = 0;
		int superIndex = 0;
		while(superIndex < superString.length()) {
			if(subString.charAt(subIndex) == superString.charAt(superIndex)) {
				subIndex++;
			}
			superIndex++;
			if(subIndex == subString.length()) return true;
		}
		return false;
	}
	
	public static int pickInt(String prompt) {
		int choice = -1;
		while(choice == -1) {
			String input = getUserInput(prompt);
			if(isInteger(input))
				choice = Integer.parseInt(input);
				
		}
		return choice;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	public static String getUserInput(String prompt) {
		System.out.print(prompt);
		String input = sc.next();
		return input;
	}
}
