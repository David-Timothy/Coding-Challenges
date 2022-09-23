package secondMax;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class secondMax {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = Integer.parseInt(sc.nextLine());
		int index = 0;
		int[] res = new int[lines];
		while(lines > index) {
			String input = sc.nextLine();
			res[index] = secondMax(input);
			index++;
		}
		for(int i : res) {
			System.out.println(i);
		}
	}

	public static int secondMax(String line) {
		String[] inputs = line.split(" ");
		List<Integer> list = new LinkedList<Integer>();
		for(String input : inputs) {
			try {
				int number = Integer.parseInt(input);
				list.add(number);
			} catch(NumberFormatException e) {
				
			}
		}
		Collections.sort(list);
		return list.get(1);
	}
}
