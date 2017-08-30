package ADVANCE_module1;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class Read_CSV {

	public static void main(String[] args) throws Exception {
		
		CSVReader reader = new CSVReader(new FileReader("./Untitled.csv"));
		
		List<String[]> allRows = reader.readAll();
		
		System.out.println("Total number of rows in csv are : "+allRows.size());
		
		Iterator<String[]> row = allRows.iterator();
		
		while(row.hasNext())
		{
			
			System.out.println("Element in row:");
			for (String elem: row.next())
			{
				System.out.println(elem);
			}
		
		}

	}

}
