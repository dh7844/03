package com.kh.logic;

public class BeforeLogic {

	public static void main(String[] args) {
		// 조건문 : 어떠한 조건식을 통해 참과 거짓일 때 실행할 코드를 나눠주는 문법 
		// 비교 연산자와 일반 논리 연산자 익숙해지기
		// ** 조건문에 들어가는 조건식을 대부분 비교 연산자와 일반 논리 연산자로 이루어짐.
		
		int minHeight = 120;
		int maxHeight = 190;
		int count = 10; 
		double mass = 10.0;
		boolean check = false;
		char ch = 'A';
		
		// ----------------------------//
		// 위의 6가지 변수를 활용하여 비교 연산자와 일반 논리 연산자를 사용한
		//true / false 를  각각 15개씩 만들기 
		
		// -- true 15개 --//
		
		System.out.println("결과1 : " + (count == mass));
		System.out.println("결과2 : " + (minHeight == 120.0));
		System.out.println("결과3 : " + (maxHeight == 190.0));
		System.out.println("결과4 : " + (count >= mass)); 
		System.out.println("결과5 : " + (count == mass + 0));
		System.out.println("결과6 : " + (minHeight >= maxHeight - 70));
		System.out.println("결과7 : " + (maxHeight > minHeight +30));
		System.out.println("결과8 : " + (ch > mass && ch > count));
		System.out.println("결과9 : " + (count < minHeight || count > maxHeight));
		System.out.println("결과10 : " + (maxHeight  * count == minHeight * count + 700));
		System.out.println("결과11 : " + (count / mass == 1));
		System.out.println("결과12 : " + (ch <= 1510));
		System.out.println("결과13 : " + (minHeight / count == 12));
		System.out.println("결과14 : " + (maxHeight / minHeight < 20));
		System.out.println("결과15 : " + (minHeight - 100 >= 20 && maxHeight - 170 >= 20));
		
		
		// -- false 15개 --//
		
		System.out.println("결과1 : " + (ch >= count && maxHeight == 150));
		System.out.println("결과2 : " + (minHeight == 200));
		System.out.println("결과3 : " + (maxHeight == 120));
		System.out.println("결과4 : " + (count >= 15));
		System.out.println("결과5 : " + (count * mass >= minHeight));
		System.out.println("결과6 : " + (ch + mass < 10));
		System.out.println("결과7 : " + (count != mass));
		System.out.println("결과8 : " + (minHeight / 10 > maxHeight / 10));
		System.out.println("결과9 : " + (minHeight * 5 <= 500 || minHeight * 4 >= 500));
		System.out.println("결과10 : " + (ch == 100 && count !=10));
		System.out.println("결과11 : " + (count % 10 == 5));
		System.out.println("결과12 : " + (maxHeight <= minHeight + 40));
		System.out.println("결과13 : " + (50 * count -10 < 45 * mass));
		System.out.println("결과14 : " + (count / 10 >= 5 && count == 10 ));
		System.out.println("결과15 : " + (check != !true));
		
		
	}
	
	
}
