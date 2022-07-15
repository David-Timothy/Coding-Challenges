import java.util.LinkedList;
import java.util.Scanner;

public class Intersection {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList<String> list1 = getList(); 
		LinkedList<String> list2 = getList();
		System.out.println(
				intersection(
						list1,
						list2
						)
				);
	}

	static LinkedList<String> getList() {
		LinkedList<String> input = new LinkedList<String>();
		int buildingList = (int) pickLong("Size of List : ");
		while(buildingList > 0) {
			String getInput = getUserInput("Node "+input.size()+":");
				input.add(getInput);
				buildingList--;
		}
		return input;
	}
	
	static String intersection(LinkedList<String> list1, LinkedList<String> list2) {
		for(String s : list1) {
			if(list2.contains(s)) {
				if(list2.containsAll(list1.subList(list1.indexOf(s), list1.size())))
					if(list1.containsAll(list2.subList(list2.indexOf(s), list2.size())))
						return s;
			}
		}
		return null;
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
