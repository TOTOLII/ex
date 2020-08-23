package com.loop;

import java.util.Scanner;

public class ForWhile {
	
	Scanner sc = new Scanner(System.in);
	
	public void printStar1(){
		
		System.out.print("정수를 하나 입력해 주세요. : ");
		int var1_input = sc.nextInt();
		
		if (var1_input > 0) {
			for (int i = 1; i <= var1_input; i++) {
				for (int j = 0; j < i-1; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.printf("%d는 양수가 아닙니다.", var1_input);
		}
	}

	public void printStar2(){
		
		System.out.print("정수를 하나 입력해 주세요. : ");
		int var2_input = sc.nextInt();
		
		if (var2_input>0) {
			for (int i = 1; i <= var2_input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			for (int i = 0; i < (var2_input * -1); i++) {
				System.out.print(var2_input * -1);
//				for (int j = (var2_input*-1); j < 0 ; j--) {
	//				System.out.print("*");
		//		}
			//	System.out.print(" ");
		//	}
			System.out.println();
		}
	}
	
}
