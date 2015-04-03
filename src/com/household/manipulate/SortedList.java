package com.household.manipulate;

import java.util.Collections;
import java.util.LinkedList;
import java.io.File;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;

import com.household.model.ListHouse;

public class SortedList {

	//create the ArrayList to record house objects 
		LinkedList<ListHouse> hList = new LinkedList<ListHouse>();

		//insert a specific house detail ADD BUTTON
		public boolean insert(ListHouse lHouse){
			boolean i;
			i = hList.add(lHouse);
			return i;
		}

		//
		public boolean makeEmpty(){
			boolean i = false;
			hList.clear();
			if(hList.isEmpty()) {i=true;}
			
			if(i == true) { this.fileDelete(); }
			return i;
		}
		
		public boolean fileDelete(){
			File file = new File("C:/Users/DAYANANDA/git/Records.txt"); 
			boolean i = file.delete();
			return i;
		}
		
		//get and send the next house detail as a sorted list
		public ListHouse nextListHouse(LinkedList<ListHouse> listhouseList,int lotNo){
			
			Collections.sort(listhouseList);
			if(lotNo == 0){
				return listhouseList.getFirst();
			}else{
				int index = 0;
				for (int i = 0; i < listhouseList.size(); i++) {
						ListHouse LH = listhouseList.get(i);
						   if(LH.getLotNo() == lotNo){
						   index = i;
					   }
					}

			ListHouse nextHousehold = null;		
			index += 1;
			nextHousehold = listhouseList.get(index);
				if(index == listhouseList.size() - 1){
				nextHousehold = listhouseList.getFirst();
			}
				
			return nextHousehold;		
			}		
		}
		
		
		public ListHouse remove(int lotNo){
		
			ListHouse removed = null;
			int index = hList.indexOf(lotNo);
			// sort listhouse list using compare to method		
			Collections.sort(hList);
			removed = hList.remove(index);
			
			return removed;
		}
		
		public ListHouse findListHouse(LinkedList<ListHouse> listhouseList,int lotNo){
			
			ListHouse selectedHousehold= null;		
			// sort listhouse list using compare to method
			
			Collections.sort(listhouseList);
			
			for(ListHouse listHouse:listhouseList){
				
				if(listHouse.getLotNo()==lotNo){
					selectedHousehold =listHouse;
				}			
			}				
			return selectedHousehold;		
		}
}
