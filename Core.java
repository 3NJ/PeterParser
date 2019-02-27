package mainpackage;
import java.io.*;
import java.util.*;

/**
 * @author Henry L. and Keith T.
 *
 */
public class Core 
{	// beginning of class
	
	
	/*		ArrayList output = new ArrayList<String>();
		
			 FileReader something;//This will create the variable used by  method
			//Since the FileReader method can only accept certain characters 
			//Scanner is needed to handle the primatives in an efficient manner
		
			 Scanner input; 
			 
			 try {
				   something = new FileReader("something.txt");  // create the stream
				   input = new Scanner( new File ("something.txt"));
				}s
			catch (FileNotFoundException e) 
			{
			   System.out.println("File not Found"); // do something to handle the error -- maybe, end the program
			}
			
			*/
		
// System Input Utility -- Scanner
	 static Scanner Input = new Scanner(System.in);
//	 	static in = Input.nextLine();
	
		private static String InputText;
 //Getter and Setter for InputText	
		
		private static String GetInputText () {
			
			return InputText;
			
		}
		
		private static void SetInputText(String text) {
					
					InputText=text; 
		}
		
		
			// Test Case  1
					/*
					 * Output user input after gathering it from user input
					 * 
					 *
					 */
			//Instructions for use
					private static String Stuff = "Thank you for using this program...Please enter information..";
					
					static void Instructions(String x) {
						x = Stuff;
						System.out.printf(x);//This prints out instructions given (a String) from the x variable
						System.out.println();
						SetInputText(Input.nextLine());
						Instructions(1);
						Instructions(2);
						
						
					}
					static void Instructions(int n) {
						if (n == 1) { //option 1 prints out what was entered
							System.out.println("This is what you wrote: " + GetInputText()); 
						}
						else{//option 2 ends the program with a fond farewell
							System.out.println("Thanks again for using this program  :) !");
						}
						
					}
					

					
		public static void main (String args[]) {
			
			/* With Static Methods!!
			 * Core Start = new Core(); 
				Start.Instructions(Stuff);
				GetInputText(Input.nextLine());
				Start.Instructions(1);
				Start.Instructions(2);
			 * */
			
			
			//Without Static Methods
			Instructions(Stuff);

		
	

	}		
}//end of class
