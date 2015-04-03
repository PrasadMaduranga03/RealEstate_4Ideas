package com.household.persistence;

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
	
	
	/**
	 * Method used for save each lightHouse entities
	 * @param lightHouse
	 */
	public LinkedList<ListHouse> retreiveHouseHoldRecord(){
		LinkedList<ListHouse> allHouseHoldList = new LinkedList<ListHouse>();
		ListHouse listHouse = null;
		try {
			// String sReadline;
			FileReader file = new FileReader("D:/Java_Project/RealEstateProject/hello.txt");
			Scanner scanLine=new Scanner(file);
			while(scanLine.hasNextLine())	{				
			String csvFileString =scanLine.nextLine();
			//create each house hold 
			ListHouse household = new ListHouse();
				String householdFieldarrInfo[] = csvFileString.split(",");
				household.setLotNo(Integer.parseInt(householdFieldarrInfo[0]));
				household.setFirstName(householdFieldarrInfo[1]);
				household.setLastName(householdFieldarrInfo[2]);
				household.setPrice(new BigDecimal(householdFieldarrInfo[3]));
				household.setSquareFeet(Double.parseDouble(householdFieldarrInfo[4]));
				household.setNoOfBedRooms(Integer.parseInt(householdFieldarrInfo[5]));
				//
				allHouseHoldList.add(household);
				}
				scanLine.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return allHouseHoldList;
	}	
}
