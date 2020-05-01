package model;

import java.util.Date;

public class Car {
	
	String modelName;
	Integer productionYear;
    Double mileage;
    String fuelType;
    Integer enginePower;
    Integer numberOfOwner;
    Integer yearOfPurchase;
    
	public Car(String modelName, Integer productionYear, Double mileage, String fuelType, Integer enginePower,
			Integer numberOfOwner, Integer yearOfPurchase) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.mileage = mileage;
		this.fuelType = fuelType;
		this.enginePower = enginePower;
		this.numberOfOwner = numberOfOwner;
		this.yearOfPurchase = yearOfPurchase;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Integer getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(Integer productionYear) {
		this.productionYear = productionYear;
	}
	public Double getMileage() {
		return mileage;
	}
	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Integer getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(Integer enginePower) {
		this.enginePower = enginePower;
	}
	public Integer getNumberOfOwner() {
		return numberOfOwner;
	}
	public void setNumberOfOwner(Integer numberOfOwner) {
		this.numberOfOwner = numberOfOwner;
	}
	public Integer getYearOfPurchase() {
		return yearOfPurchase;
	}
	public void setYearOfPurchase(Integer yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", productionYear=" + productionYear + ", mileage=" + mileage
				+ ", fuelType=" + fuelType + ", enginePower=" + enginePower + ", numberOfOwner=" + numberOfOwner
				+ ", yearOfPurchase=" + yearOfPurchase + "]";
	}
    
}
