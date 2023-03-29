package exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Trycatchex {
	
	/**
	 * try-catch
	 * 
	 * try {
	 * 
	 *  //예외가 발생할 소지가 있는 코드
	 *  
	 *   } catch(Exception e) {
	 *   
	 *		//try블럭에서 예외가 발생 시 실행을 멈추고 catch블럭으로 이동하여
	 * 		  예외처리 코드를 실행
	 *	}
	 *
	 */
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사용자가 문자를 입력했을 경우 숫자로 변환 시 오류 발생
		int num =0;
		boolean run = true;
		
		while(run) {
			try {
				System.out.println("숫자를 입력하세요>>>");
				num = sc.nextInt();
				System.out.println(num+"이 입력되었습니다");
				run=false;
			} catch(InputMismatchException e) {
				String str = sc.next();
				System.out.println(str+"은 입력가능한 숫자가 아닙니다");
			}
			
		}

		
	}

}
