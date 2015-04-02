package com.household.manipulate;

import java.util.ArrayList;

import com.household.model.ListHouse;

public class SortedList {

	//create the ArrayList to record house objects 
		ArrayList<ListHouse> hList = new ArrayList<ListHouse>();

		//insert a specific house detail
		public boolean insert(ListHouse lHouse){
			boolean i;
			i = hList.add(lHouse);
			return i;
		}

		public boolean makeEmpty(){
			boolean i = false;
			hList.clear();
			
			if(hList.isEmpty()) {i=true;}
			return i;
		}
}
