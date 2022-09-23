package alphanumericSum;

import java.util.Scanner;

public class alphanumericSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = Integer.parseInt(sc.nextLine());
		int index = 0;
		int[] res = new int[lines];
		while(lines > index) {
			String input = sc.nextLine();
			res[index] = prcoessInput(input);
			index++;
		}
		for(int i : res) {
			System.out.println(i);
		}
	}
	
	public static int prcoessInput(String input) {
		int res = 0;
		for(int i = 0; i < input.length(); i++) {
			try {
				res += Integer.parseInt(input.charAt(i)+"");
			} catch (NumberFormatException e) {
				
			}
		}
		return res;
	}

}
