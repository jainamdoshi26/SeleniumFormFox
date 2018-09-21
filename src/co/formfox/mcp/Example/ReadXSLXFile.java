package co.formfox.mcp.Example;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class ReadXSLXFile {

	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Construct a BufferedReader object from the input file
		var fileRows = new List();
		BufferedReader r = new BufferedReader(new FileReader("D:\\Demo\\sheet1.csv"));
		int i = 1;
		String[][] data1 = null;
		var csvList = new ArrayList<List>();
		String[][] data11 = null;
		try {
			// "Prime" the while loop        
		    String line = r.readLine();
		    while (line != null) {
		    	
		        // Print a single line of input file to console
		        System.out.println("Line "+i+": "+line); 
//		        csvList.add(line.split(","));
		        String []data=line.split(",");
//		        data11[i]=line.split(",");
		        // Prepare for next loop iteration
		        line = r.readLine();
		        i++;
			    System.out.println("Array of line "+i+": "+Arrays.toString(data)); 
			    System.out.println("");
		    }
		} finally {
		    // Free up file descriptor resources
		    r.close();
		}

		// Remember the next available employee number in a one-up scheme
		int nextEmployeeId = i;
		

	}

}



