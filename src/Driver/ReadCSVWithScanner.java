package Driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.formfox.mcp.paths.Constants;

import java.io.*;

public class ReadCSVWithScanner {
	
	static ArrayList<assignData> getDataList=readCSV();
	
	public static ArrayList<assignData> readCSV(){
		// open file input stream
		try {
		BufferedReader reader = new BufferedReader(new FileReader(Constants.CSVFILE));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		ArrayList<assignData> dataList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			assignData tmp = new assignData();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext())
			{
				String data = scanner.next();
//				System.out.println(data);
				if (index == 0)
					tmp.setSSN(data);
				else if (index == 1)
					tmp.setFirstName(data);
				else if (index == 2)
					tmp.setLastName(data);
				else if (index == 3)
					tmp.setBirthdate(data);
				else if (index == 4)
					tmp.setEveningPhone(data);
				else if (index == 5)
					tmp.setDaytimePhone(data);
				else if (index == 6)
					tmp.setMobilePhone(data);
				else if (index == 7)
					tmp.setUsername(data);
				else if (index == 8)
					tmp.setPassword(data);
				else if (index == 9)
					tmp.setEmailID(data);
				else if (index == 10)
					tmp.setSiteAddress(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			dataList.add(tmp);
		}
		
		//close reader
		reader.close();
		
//		System.out.println(dataList);
//		System.out.println("");
//		System.out.println("");System.out.println("");
//		System.out.println(dataList.get(0).getName());
		return dataList;
		}
		catch(IOException ex) {
			return null;
		}
	}
	
	public static ArrayList<assignData> getDataList() {
		return getDataList;
	}

}
