package Pascal;

import java.util.Scanner;

public class Withdraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int balance=5000;
		
		System.out.println("Enter warmout");
		int warmout=sc.nextInt();
		
		if (balance>warmout){
			balance=balance-warmout;
			System.out.println("balance "+balance);
		}
		else {
			System.out.println("not enough");
		}
		
		
		
	}

}
