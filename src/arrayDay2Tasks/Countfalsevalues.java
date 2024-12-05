package arrayDay2Tasks;

import java.util.Scanner;

public class Countfalsevalues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean num[]=new boolean[5];
		System.out.println("Enter 5 number");
		int count=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextBoolean();
		}
		
		for (int i = 0; i < num.length; i++) {
			if(false==num[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
