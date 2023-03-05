import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		/*** data types
		 * 
			String - stores text, such as "Hello". String values are surrounded by double quotes
			int - stores integers (whole numbers), without decimals, such as 123 or -123
			float - stores floating point numbers, with decimals, such as 19.99 or -19.99
			char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
			boolean - stores values with two states: true or false
		*/
		
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		System.out.println("Data Types");
		System.out.println("myNum=" + myNum);
		System.out.println("myFloatNum=" + myFloatNum);
		
		/***
		 * 
			In Java, there are two types of casting:
			
			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		 */
		/* Widening Casting
		Widening casting is done automatically when passing a smaller size type to a larger size type: */
	    int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	    
	    System.out.println("Type Casting - Widening");
	    System.out.println("myInt=" + myInt);      // Outputs 9
	    System.out.println("myDouble=" + myDouble);   // Outputs 9.0
	    
	    /* Narrowing Casting
		Narrowing casting must be done manually by placing the type in parentheses in front of the value: */
	    double myDouble2 = 9.78d;
	    int myInt2 = (int) myDouble; // Manual casting: double to int
	    
	    System.out.println("Type Casting - Narrowing");
	    System.out.println("myDouble2=" + myDouble2);   // Outputs 9.78
	    System.out.println("myInt2=" + myInt2);      // Outputs 9
	    
	    /***
	     * 
			Instead of writing many if..else statements, you can use the switch statement.
			
			The switch statement selects one of many code blocks to be executed:
	     */
	    
	    int day = 4;
	    switch (day) {
	      case 1:
	        System.out.println("Monday");
	        break;
	      case 2:
	        System.out.println("Tuesday");
	        break;
	      case 3:
	        System.out.println("Wednesday");
	        break;
	      case 4:
	        System.out.println("Thursday");
	        break;
	      case 5:
	        System.out.println("Friday");
	        break;
	      case 6:
	        System.out.println("Saturday");
	        break;
	      case 7:
	        System.out.println("Sunday");
	        break;
	    }
	    // Outputs "Thursday" (day 4)
	    
		/***
		 * 
			Loop Through an Array with For-Each
			There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
		 */
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
			  System.out.println(i);
		}
		
		/***
		 * 
			A multidimensional array is an array of arrays.
			
			Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
			
			To create a two-dimensional array, add each array within its own set of curly braces:
		 */
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		System.out.println("Multi-Dimensional Array " + myNumbers[1][2]); // Outputs 7
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = myScanner.nextLine();
		System.out.println("Username is: " + userName);
	}
}
