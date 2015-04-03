package com.household.persistence;

<<<<<<< HEAD
public class HouseFile {

=======
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

import com.household.model.ListHouse;

public class HouseFile {
	
	
	/**
	 * Method used for save each lightHouse entities
	 * @param lightHouse
	 */
	public void saveHouseHoldRecord(ListHouse listHouse){
		try {
			File file = new File("D:/Java_Project/RealEstateProject/hello.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			} 
				
				FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
				BufferedWriter lno = new BufferedWriter(writer);
				// http://www.mkyong.com/java/how-to-export-data-to-csv-file-java/
				for (int i = 0; i < 1; i++) {
					lno.write(listHouse.getLotNo() + ","
							+ listHouse.getFirstName() + ","
							+ listHouse.getLastName() + ","
							+ listHouse.getPrice() + ","
							+ listHouse.getSquareFeet()+ ","
							+ listHouse.getNoOfBedRooms());
					
				}
				lno.newLine();
				lno.flush();
				lno.close();
			
		} catch (Exception e) {

		}								
	}
	
		
>>>>>>> 5b9898710ecf0ded6a6d2f84bb53a0607dd8d68a
}
