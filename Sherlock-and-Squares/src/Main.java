import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long min= pickLong("Enter minimum value of the range  ");
        long max= pickLong("Enter maximum value of the range  ");
		System.out.println(getBetween(min, max).size());
	}

	static List<Long> getUpTo(Long max) {
		boolean counting = true;
		List<Long> numbers = new LinkedList<Long>();
		int m = 0;
		while(counting) {
			Long toAdd = get(m);
			if(toAdd > max)
				counting = false;
			else
				numbers.add(toAdd);
			m++;
		}
		return numbers;
	}
	
	static List<Long> getBetween(Long min, Long max) {
		boolean counting = false;
		List<Long> numbers = new LinkedList<Long>();
		int m = 0;
		while(!counting) {
			Long toAdd = get(m);
			if(toAdd > min) {
				counting = true;
				numbers.add(toAdd);
			}
			m++;
		}
		while(counting) {
			Long toAdd = get(m);
			if(toAdd > max)
				counting = false;
			else
				numbers.add(toAdd);
			m++;
		}
		return numbers;
	}
	
	static Long get(int i) {
		// TODO Auto-generated method stub
		i = i+2;
		return (long) i*i;
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
