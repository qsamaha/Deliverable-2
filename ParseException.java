import java.util.Scanner;
import java.util.Arrays;


public class ParseException extends Exception {
	
	public static void main(String args[]) throws ParseException {
			String text;
			String text1;
			int sum;
			int sum1;
			
			
			System.out.println("Enter a Word");
			Scanner sc = new Scanner(System.in);
			text = sc.next();
	    
	    
	   try {
	        
		   	
	       
	   byte[] bytes = text.getBytes("US-ASCII");
	   sum = 0;
	   for(byte b : bytes)
	       sum+=b;
	        		
	    System.out.println("Your word's Unicode values are ");
	    System.out.println(Arrays.toString(bytes));
	    System.out.println();
	    System.out.println("The sum of your word's Unicode values is ");
	    System.out.println(sum);
	    System.out.println();    
	    
	    System.out.println("Enter another Word");
		text1 = sc.next();
			   
	        
	   	byte[] bytes1 = text1.getBytes("US-ASCII");
		sum1 = 0;
	    for(byte b : bytes1)
	        sum1+=b;
	        
		 System.out.println("Your word's Unicode values are ");
		 System.out.println(Arrays.toString(bytes1));
		 System.out.println();
		 System.out.println("The sum of your word's Unicode values is ");
		 System.out.println(sum1);
		 System.out.println();
	
		 int uniSub;
		  
	     if (sum < sum1) {
	    	uniSub = sum1 - sum;
	     }
	     else {
	    	 uniSub = sum - sum1;
	     }
	     
	     System.out.println("The difference between your words Unicode values is " + uniSub);
	     
	        
	        
	    } catch (java.io.UnsupportedEncodingException e) {
	        e.printStackTrace();{
	           }
  }
	   
	}
}

	        
	 
