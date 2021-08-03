package springmvc.model;

public class MyServices {

public static int add(double number1,double number2){
		
		double result=number1+number2;
		int value=(int)result;
		
		System.out.println(Math.floor((int)value));
		System.out.println("checl");
		
		return value;
		
	}
	
	public static double div(double number1,double number2){
		
		if (number1==0 || number2 == 0) {
			throw new IllegalArgumentException("Number can not be divded by 0");
		}
		
		double result=number1/number2;
		int value=(int)result;
		
		System.out.println(value);
		System.out.println("checl");
		
		return value;
		
			
	}
	public static int sub(double number1,double number2){
		
		double result=number1-number2;
		int value=(int)result;
		
		System.out.println(value);
		System.out.println("check");
		
		return value;
		
	}
	public static double mul(double number1,double number2){
		
		double result=number1*number2;
		int value=(int)result;
		
		System.out.println(value);
		System.out.println("checl");
		
		return value;
	}

}
