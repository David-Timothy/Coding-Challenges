package selReverse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SelReverse {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList<Long> list1 = getList(); 
		Collections.sort(list1);
		System.out.println(selReverse(list1, (int) pickLong("order size :")));
	}

	public static List<Long> selReverse(List<Long> l, int size) {
		List<Long> temp = new LinkedList<Long>();
		List<Long> returned = new LinkedList<Long>();
		List<Long> reverse = new LinkedList<Long>();
		temp.addAll(l);
		while(!temp.isEmpty()) {
			reverse.add(temp.get(0));
			temp.remove(0);
			if(reverse.size() == size) {
				while(!reverse.isEmpty()) {
					returned.add(reverse.get(reverse.size()-1));
					reverse.remove(reverse.size()-1);
				}
			}
		}
		return returned;
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
