import java.util.Scanner;

public class ProgrammersCodingTestPrintPrac {

	// 문자열 출력 문제 풀이
	public static void main(String[] args) {
		// 문제 0번
		/*String msg = "Spring is beginning";
		int val1 = 3;
		String val2 = "3";
		
		System.out.println(msg);
		System.out.println(val1 + 10);
		System.out.println(val2 + "10");*/
		
		// 문제 1번 (문자열 출력)
		/*Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);*/
		
		// 문제 2번 (a와 b 출력)
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);*/
		
		// 문제 3번 (문자열 반복 출력)
		/*Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print(str);
		}*/
		
		// 문제 4번 (대소문자 변환 출력)
		/*Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for(int i = 0; i < a.length(); i++) {
        	b = a.charAt(i);
        	
        	if(Character.isUpperCase(b)) {
        		answer += Character.toLowerCase(b);
        	} else {
        		answer += Character.toUpperCase(b);
        	}
        }
        
        System.out.print(answer);*/
		
		// 문제 5번 (특수문자 출력)
		//System.out.print("!@#$%^&*(\\'\"<>?:;");
		
		// 문제 6번 (덧셈식 출력)
		/*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        
        System.out.println(a + " + " + b + " = " + c);*/
		
		// 문제 7번 (문자열 붙여서 출력)
		/*Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        System.out.println(a + b);*/
		
		// 문제 8번 (문자열 돌리기)
		/*Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i = 0; i < a.length(); i++) {
        	System.out.println(a.charAt(i));
        }*/
		
		// 문제 9번 (홀짝 구분)
		/*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n % 2 == 1) {
        	System.out.println(n + " is odd");
        } else {
        	System.out.println(n + " is even");
        }*/
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		Solution solution = new Solution();
		String result = solution.solution(str1, str2);
		
		System.out.println("결과 값 확인 : " + result);
	}
}

// 문제 10번 (문자열 겹치기)
/*class Solution {
	public String solution(String my_string, String overwrite_string, int s) {
		String answer = "";
        
        answer = my_string.substring(0,s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length(), my_string.length());
            
        return answer;
	}
}*/

// 문제 11번 (문자열 섞기)
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
        	answer += String.valueOf(str1.charAt(i)) + str2.charAt(i);
        }
        
        return answer;
    }
}
