package com.coderscampus.teslaanalysis;

import java.util.Objects;

public class Tesla {

	String date;
	Integer sale;

	@Override
	public String toString() {
		return date + "," + sale;
	}

	public Tesla(String date, Integer sale) {
		this.date = date;
		this.sale = sale;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, sale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tesla other = (Tesla) obj;
		return Objects.equals(date, other.date) && Objects.equals(sale, other.sale);
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 * @return
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the sales
	 */
	public Integer getSales() {
		return sale;
	}

	/**
	 * @param sales the sales to set
	 */
	public void setSales(Integer sales) {
		this.sale = sales;

	}

}
