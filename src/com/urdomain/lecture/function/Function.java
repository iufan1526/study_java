package com.urdomain.lecture.function;

public class Function {

	public static void main(String[] args) {
		
		
		
	}
	
	public static int add(int a,int b) {
		int result = a + b;
		
		return result;
	} 
	
	public static int bbb(int a,int b) {
		
		int result = a - b;
		
		return result;
	}
	public static int ccc(int a,int b) {
		
		int result = a * b;
		
		return result;
	}
	public static int ddd(int a,int b) {
		
		int result = a / b;
		
		return result;
	}
	

	
	public static String str(String a,String b) {
			
		String strAdd = a + b;
		
		return strAdd;
	}
	// input : 중식 양식 한식 일식 
	// output 오늘 추천드리른 메뉴는 ?? 입니다.
	
	public static String[] str1(String a) {
		
		String[] strArr = new String[4];
		
		switch(a) {
			case "한식":
				strArr[0] = "김치"; 
				strArr[1] = "라면"; 
				strArr[2] = "불고기"; 
				strArr[3] = "떡국"; 
			break;
			case "양식":
				strArr[0] = "스테이크"; 
				strArr[1] = "햄버거"; 
				strArr[2] = "피자"; 
				strArr[3] = "파스타"; 
				break;
			case "중식":
				strArr[0] = "짜장면"; 
				strArr[1] = "탕수육"; 
				strArr[2] = "짬뽕"; 
				strArr[3] = "양장피"; 
				break;
				
			case "일식" :
				strArr[0] = "초밥"; 
				strArr[1] = "라멘"; 
				strArr[2] = "돈까스"; 
				strArr[3] = "텐동"; 
				break;
			default :
				System.out.println("없는 메뉴입니다");
		
				}
		
		
		
		return strArr;
	}
	
	public static void println(String[] a) {
		
		
	}
	
	
	
	
	

}
