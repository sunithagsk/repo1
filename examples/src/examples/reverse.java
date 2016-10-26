package examples;

import java.util.Scanner;

public class reverse {

	   public static void main(String args[])
	   {
	      int num=0;
	      int reversenum =0;
	      System.out.println("Input your number and press enter: ");
	      //This statement will capture the user input
	      Scanner in = new Scanner(System.in);
	      //Captured input would be stored in number num
	      num = in.nextInt();
	      //While Loop: Logic to find out the reverse number
	      System.out.println("1 "+reversenum);

	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
		      System.out.println("2 "+reversenum);

	          reversenum = reversenum + num%10;
		      System.out.println("3 "+reversenum);

	          num = num/10;
		      System.out.println("4 "+reversenum);

	      }

	      System.out.println("Reverse of input number is: "+reversenum);
	   }
	}