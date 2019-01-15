package mainpackage;
import java.io.*;
import java.util.*;

/**
 * @author Henry L. and Keith T.
 *
 */
public class Core 
{	// beginning of class
	
	ArrayList output = new ArrayList<String>();

	 FileReader something;//This will create the variable used by  method
	//Since the FileReader method can only accept certain characters 
	//Scanner is needed to handle the primatives in an efficient manner

	 Scanner input; 
	 
	 try {
		   something = new FileReader("something.txt");  // create the stream
		   input = new Scanner("something.txt");
		}
	catch (FileNotFoundException e) 
	{
	   System.out.println("File not Found"); // do something to handle the error -- maybe, end the program
	}

	

			
}//end of class
