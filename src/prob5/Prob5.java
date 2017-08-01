package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			
			// 게임 변수 초기화
			int minNumber = 1; // 최소값
			int maxNumber = 100; // 최대값
			int count = 1; // 입력한 횟수
			
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber;

			System.out.println(correctNumber);
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			System.out.println(minNumber + " - " + maxNumber);
			System.out.print(count + ">> ");
			int input = scanner.nextInt();
			
			while(input != correctNumber) {
				if (input > correctNumber) {
					System.out.println("더 낮게");
					maxNumber = input;
				}else {
					System.out.println("더 높게");
					minNumber = input;
				}
				
				count++;
				System.out.println(minNumber + " - " + maxNumber);
				System.out.print(count + ">> ");
				input = scanner.nextInt();
			}
			
			System.out.println("맞았습니다.");
			System.out.println("다시 하시겠습니까?(Y/N)");
			String state = scanner.next();
			
			if (state.equals("Y") || state.equals("y")) {
				continue;
			} else {
				break;
			}
		}
	}
}