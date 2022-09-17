
public class reverseanumber {
	
		  public static void main(String[] args) {

		    int num = 1234, reversed = 0;
		    
		    System.out.println("Original Number: " + num);

		    // loop until it becomes 0
		    while(num != 0) {
		    
		      // get last digit 
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last 
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reversed);
		  }
		}


