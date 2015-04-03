package com.household.householdInterface;

import com.household.model.ListHouse;

public interface Listable {

	/*
	 * object compare with another object if they are equal returns 0 If this is
	 * less than the argument , returns 0 If this more than the argument , a
	 * positive value is returns
	 */
	public abstract int compareTo(ListHouse listHouse);

	// Returns a new object with the same content
	public abstract Listable copy();

}
