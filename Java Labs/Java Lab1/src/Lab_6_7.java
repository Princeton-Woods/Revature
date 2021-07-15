
public class Lab_6_7 {

	public static void main(String[] args) {
		String beginning = "Hello";
		
		String end = " World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		long l = 203l;
		System.out.println("the value of l: "+ l);
		
		boolean b = true;
		System.out.println(b + " is true");
		
		int x = 2;
		int y = 3;
		System.out.println(x + y + " is the sum of x and y");
		//************************************************
		
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		   if (firstCondition){  
			   System.out.println("inside the if-statement");  
			   if(secondCondition) {
				   System.out.println("inside the nested if statement");
			   }
		   }
		   else if(secondCondition) {
			System.out.println(5);
			   
		   }  else {
			   System.out.println("inside the else statement");
		   }
			   
		   	System.out.println("Outside of the if-statement");
	}

}
