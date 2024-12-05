package arrayDay2Tasks;

import java.util.Scanner;

public class Avg10OddNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num[]=new int[10];
		System.out.println("Enter 10 number");
		int sum=0;
		int count=0;
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==1) {
				count++;
				sum=sum+num[i];
			}
		}
		System.out.println(sum/count);
	}
}
