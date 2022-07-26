import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LargestGap {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		LinkedList<Long> list1 = getList(); 
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println(largestGap(list1));
	}

	public static long largestGap(List<Long> l) {
		long lastItem = l.get(0);
		long curGap = 0;
		for(long num : l) {
			curGap = Math.max(num-lastItem, curGap);
			lastItem = num;
		}
		return curGap;
	}
	
	static LinkedList<Long> getList() {
		LinkedList<Long> input = new LinkedList<Long>();
		int buildingList = (int) pickLong("Size of List : ");
		while(buildingList > 0) {
			Long getInput = pickLong("Node "+input.size()+":");
				input.add(getInput);
				buildingList--;
		}
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
	
	public static String getUserInput(String prompt) {
		System.out.print(prompt);
		String input = sc.next();
		return input;
	}
}
