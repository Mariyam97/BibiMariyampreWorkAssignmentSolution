package Assignment_Programs;



import java.util.Scanner;


public class AssignmentPrograms {

	Scanner sc = new Scanner(System.in);
	
	//function to checkPalindrome
	
	public void checkPalindrome() {
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num>0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/ 10;
			
		}
if(temp == rev) {
	System.out.println("Number is Palindrome  " + temp);
}else {
	System.out.println("Number is NOT  Palindrome  " + temp);
}
	}
	
	
	//function to printPattern
	
	   public void printPattern() {
		   System.out.print("Enter the n = ");
			
			int n = sc.nextInt();
			
			for(int i = n; i>=1; i--) {
				for(int j = 1; j<=i; j++) {
					System.out.print(" * ");
				}

				System.out.println();
					
			}
	   }
	
	 
	   
	   //function to check no is prime or not

       public void checkPrimeNumber() {
	   
	   System.out.print("Enter the n = ");
		
		int n = sc.nextInt();

		if(n % 2 == 1) {
			System.out.println("Given Number is Prime Number = " + n);
		}else {
			System.out.println("Given Number is NOT Prime Number = " + n);
		}
       }
		
		// function to print Fibonacci Series

        public void printFibonacciSeries() {
        	System.out.print("Enter the count = ");
    		
    		int count = sc.nextInt();
    		
    	int	a = 0;
    	int	b = 1;
    	//int count = 5;	
    	System.out.print (a +" "+ b);
    			for(int i = 2 ; i< count; i++) {
    				int c = a + b;
    				System.out.print(" " + c);
    					a = b;
    					b = c;
    					
    			}
        }
	
	
	
	
	
      //main method which contains switch and do while loop
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AssignmentPrograms obj = new AssignmentPrograms();

        int choice;

        Scanner sc = new Scanner(System.in);
        
        
        do {

        	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

        	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

        	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

        	
        	System.out.println();

        	
        	choice = sc.nextInt();

        	switch (choice) {

        	 
        	
        case 0:

        	choice = 0;

        	break;
        
        
        
        case 1: {
        	
        	obj.checkPalindrome(); 
        	}
        System.out.println();
        	break;
        	
        	
        case 2: {

        	 

        	obj.printPattern();

        	}
        System.out.println();
        	break;
        	
        	
        case 3: {

        	obj.checkPrimeNumber();

        	}
        System.out.println();
        	break;

        	 

        	case 4: {

        	obj.printFibonacciSeries();

        	}
        	System.out.println();
        	break;
        	default:

        		System.out.println("Invalid choice. Enter a valid no.\n");

        		}

        		 

        		} while (choice != 0);

        		System.out.println("Exited Successfully!!!");

        		sc.close();

        		

        		 

        		

	}

}
