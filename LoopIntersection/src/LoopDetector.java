import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LoopDetector {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList<String> input = new LinkedList<String>();
		int buildingList = (int) pickLong("Size of List : ");
		while(buildingList > 0) {
			String getInput = getUserInput("Node "+input.size()+":");
				input.add(getInput);
				buildingList--;
		}
		System.out.println(Loop(input));
	}
	
	static <N> N Loop(LinkedList<N> list) {
		List<N> counted = new LinkedList<N>();
		for(N n : list) {
			if(counted.contains(n))
				return n;
			counted.add(n);
		}
		return null;
	}
	
	public static String getUserInput(String prompt) {
		System.out.print(prompt);
		String input = sc.next();
		return input;
	}
	
	public static long pickLong(String prompt) {
		long choice = -1;
		while(choice == -1) {
			String input = getUserInput(prompt);
			if(isLong(input))
				choice = Long.parseLong(input);
				
		}
		return choice;
	}
	
	public static boolean isLong(String s) {
	    try { 
	        Long.parseLong(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}

}
