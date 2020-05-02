package model;

public class InsurancePrice {

	private Double price = 0.0;
	private Integer priority;
	
	public InsurancePrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "InsurancePrice [price=" + price + "]";
	}

}
