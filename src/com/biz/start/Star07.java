package com.biz.start;

public class Star07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus(30,40);
		plus(50,20);
		plus(100, 200);
		plus(3, 100);
		plus(5, 20);
		/*
		 * 다음에 나열된 두 숫자의 덧셈, 곱셈을
		 * 계산하여 콘솔에 보여주는 코드를
		 * 작성하시오
		 * 30, 40
		 * 50, 20
		 * 100, 200
		 * 3, 100
		 * 5, 20
		 * 
		 */
		
System.out.println("==========");
	
	int a = 30; int b = 40;
	
	System.out.println("a + b = " + (a + b));
	System.out.println("a x b = " + a * b);
	
	a = 50; b = 20;
	
	System.out.println("a + b = " + (a + b));
	System.out.println("a x b = " + a * b );
	
	a = 3; b = 100;
	
	System.out.println("a + b = " + (a + b));
	System.out.println("a x b = " + a * b );
	
	a = 5; b = 20;
	
	System.out.println("a + b = " + (a + b));
	System.out.println("a x b = " + a * b );
  
	}

	

public static void plus(int a,int b) {
	
	
	System.out.println("a + b = " + (a + b));
	System.out.println("a x b = " + a * b);
	
	
	


}
}


