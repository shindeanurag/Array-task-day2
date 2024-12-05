package arrayDay2Tasks;

import java.util.Scanner;

public class PrintTwoDigitNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter 5 number");
		
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if(10 <= num[i] && num[i]<=99) {
				System.out.println(num[i]);
			}
		}
	}
}
