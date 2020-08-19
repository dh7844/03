package com.kh.logic.test;

import java.util.Scanner;

public class IfTest {

	/*
	 * if 문은 특정조건을 만족시킬 때 
	 * 실행할 구문을 구현하는 조건문이다.
	 * 순서도에서 마름모 역할 
	 */
	
	public void testMethod1() {
		// 기본적인 if문 
		// 마스크 착용 유무를 입력받아
		// 마스크를 착용해주세요 혹은
		// 이용해주셔서 감사합니다.
		// 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구 
		System.out.print("마스크 착용 하셨나요? (Y/N) : ");
		char answer = sc.next().charAt(0);
		
		// 입력받은 값을 비교하여 상황에 따른 결과 출력하기
		
		if(answer == 'Y') {
			// 만약 조건문에 해당하면, 참인 상황
			System.out.println("이용해 주셔서 감사합니다!");
		
		} else {
			// 위의 조건에 만족하지 않는, 조건문이 거짓인 나머지 상황
			System.out.println("마스크를 반드시 착용해주세요,:)");
		
		}
	}
		
	public void testMethod2() {
	    // 조건에 따른 결과가 3개 이상일 경우 
		// if-else if 를 사용한다. 
		// 국어, 영어, 수학 점수를 입력받아 
		// 평균에 따른 성적 구하기 
		
		/*
		 * - 기준 -
		 * 평균이 90점 이상이면 A
		 * 평균이 80점 이상이면 B
		 * 평균이 70점 이상이면 C
		 * 평균이 60점 이상이면 D
		 * 아니면 F
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// 안내 문구 
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		int avg = sum / 3;
		
		String grade = "";
		
		if(avg >= 90) grade = "A";	   
		else if(avg >= 80) grade = "B";   
		else if(avg >= 70) grade = "C";
	    else if(avg >= 60) grade = "D";
		else grade = "F";
		
		System.out.println("당신의 성적은 " + grade + " 입니다.");
	}
	
	public void testSimya() {
		// if문을 활용하여 메뉴판 만들기
		
		// 1. 메뉴판 출력하기 
		System.out.println("-- 한진영's 심야식당 ver 1.0 --");
		System.out.println("1. 떡볶이");
		System.out.println("2. 닭똥집");
		System.out.println("3. 두리안");
		System.out.println("4. 취두부");
		System.out.println("5. 솔의눈");
		System.out.println("---------------------------");
		
		// 2. 사용자에게 메뉴 고르게 하기
		System.out.println("메뉴 선택 : ");
		Scanner sc = new Scanner(System.in);
		
		int selectMenu = sc.nextInt();
		
		if(selectMenu == 1) {
			System.out.println("떡볶이를 선택하셨습니다.");
			System.out.println("가격은 5000원입니다. (4인 이상 주문)");
		} else if (selectMenu == 2) {
			System.out.println("닭똥집을 선택하셨습니다.");
			System.out.println("가격은 30000원입니다. (단일메뉴)");
		}  else if (selectMenu == 3) {
			System.out.println("두리안을 선택하셨습니다.");
			System.out.println("두리안은 서비스입니다. (Take out 비용 별도)");		
		} else if (selectMenu == 4) {
			System.out.println("취두부을 선택하셨습니다.");
			System.out.println("가격은 10만원입니다. (VAT 별도)");		
	    } else if (selectMenu == 5) {
			System.out.println("솔의눈을 선택하셨습니다.");
			System.out.println("가격은 7500원입니다.");
	    } else {
	    	System.out.println("잘못 선택하셨습니다.");
	    	System.out.println("다시 주문해주시기 바랍니다.");
	    }
	}
	
	public void testMethod3() {
		// 다중 if문 (중첩 if문) 구현하기
		
		// 학생 점수 입력 받아 성적 표시하되
		// 90점 이상 A --> 95점 이상 A+
		// 80점 이상 B --> 85점 이상 B+
		// 70점 이상 C --> 75점 이상 C+
		// 70점 미만 F
		
		// **각 점수가 F 점수보다 높고,
		// 5점 이상이면 '+' 추가하기

		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 점수 입력 : ");
		
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score > 89) {
			grade = "A";	   
			if (score > 94) grade += "+";
			
		} else if(score > 79) {
			grade = "B";
			if (score > 84) grade += "+";
		}
		else if(score > 69) {
			grade = "C";
			if (score > 74) grade += "+";
		}
		else {
			grade = "F";
	    }
	
		System.out.println("당신의 성적은 " + grade + " 입니다.");
		
	}
	   
	public void exercise() {
		
		// [ 문제 ]
				// 과일이름(“사과”, ”바나나”, ”복숭아”,”키위”)를 입력 받아 해당하는 
			    	// 가격에 맞게 상품명과 가격이 출력되게 하시오.
				// 사과 - 1000원
				// 바나나 - 3000원
				// 복숭아 - 2000원
				// 키위 - 5000원
		 
				// ** 문자열은 일반 문자나 기본 자료형들과 다르게
				//    참조 자료형의 형태를 띄기 때문에
				//    실제 문자열이 가진 값은 해당 문자열의 메모리 안 주소값을 가진다.
				//    따라서 Heap 메모리 안에 저장된 주소의 값을 실제 문자열과
				//    비교하게 되어 올바른 비교 결과가 나오지 않는다.
				//    이를 해결하기 위해 문자열들은 "문자열".equals("비교할 문자열")라는
				//    메소드를 별도로 제공한다.
				
				Scanner sc = new Scanner(System.in);
				
				// 1. 메뉴판 출력
				System.out.println("-- 한진영's 과일 가게 ver 1.0 --");
				System.out.println(" 사과");
				System.out.println(" 바나나");
				System.out.println(" 복숭아");
				System.out.println(" 키위");
				System.out.println("--------------------");
				
				System.out.print("과일 이름을 골라 주세요 : ");
				Scanner sc1 = new Scanner(System.in);
				String fruit = sc1.next();
				int price = 0;
				
				String fruitname = "";
				
				if(fruitname .equals("사과")) {
					
					System.out.println("가격은 1000원입니다.");
				} else if (fruitname .equals("바나나")) {
				
					System.out.println("가격은 3000원입니다.");
				}  else if (fruitname .equals("복숭아")) {
				
					System.out.println("가격은 2000원입니다.");		
				} else if (fruitname .equals("키위")) {
				
					System.out.println("가격은 5000원입니다.");		
					
				  
					System.out.println( fruitname + " 을 선택했습니다.");
					System.out.println( "가격은 " + price + " 입니다.");
					
			    } else {
			    	System.out.println("잘못 선택하셨습니다.");
			    	System.out.println("다시 주문해주시기 바랍니다.");
			    }
		
		
		
		000.
	}
	
	
	
}
