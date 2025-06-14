package ch05;

import java.util.Scanner;

//실습 5-4: 유클리드 호제법으로 최대공약수 구하기 - p.167~169
//gcd(8,22) = gcd(22,8) = gcd(8,6) = gcd(6,2) = gcd(2,0) = 2

public class Train_ex05_04 {
	 static int gcd(int x, int y) {
		 System.out.println("x = " + x + ", y = " + y);
	     if (y == 0)
	         return x;
	     else
	         return gcd(y, x % y);
	 }

	 public static void main(String[] args) {
	     Scanner stdIn = new Scanner(System.in);

	     System.out.println("두 정수의 최대공약수를 구합니다.");

	     System.out.print("정수를 입력하세요 : ");  int x = stdIn.nextInt();
	     System.out.print("정수를 입력하세요 : ");  int y = stdIn.nextInt();

	     System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
	 }
	}
