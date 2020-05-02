package com.sample.model;

public class InsurancePrice {

	public double price = 0.0;

	public InsurancePrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InsurancePrice [price=" + price + "]";
	}

}
