package com.household.model;

import java.math.BigDecimal;

public class ListHouse {

	private int lotNo;	
	private String firstName;
	private String lastName;
	private BigDecimal price;
	private double squareFeet;
	private int noOfBedRooms;
	
	public int getLotNo() {
		return lotNo;
	}
	public void setLotNo(int lotNo) {
		this.lotNo = lotNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public double getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}
	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + lotNo;
		result = prime * result + noOfBedRooms;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		long temp;
		temp = Double.doubleToLongBits(squareFeet);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListHouse other = (ListHouse) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (lotNo != other.lotNo)
			return false;
		if (noOfBedRooms != other.noOfBedRooms)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (Double.doubleToLongBits(squareFeet) != Double
				.doubleToLongBits(other.squareFeet))
			return false;
		return true;
	}
}
