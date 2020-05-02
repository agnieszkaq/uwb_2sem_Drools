package com.sample.model;

public class Car {

	public String modelName;
	public Integer productionYear;
	public Double mileage;
	public String fuelType;
	public Double enginePower;
	public Integer numberOfOwner;

	public Car(String modelName, Integer productionYear, Double mileage, String fuelType, Double enginePower,
			Integer numberOfOwner) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.mileage = mileage;
		this.fuelType = fuelType;
		this.enginePower = enginePower;
		this.numberOfOwner = numberOfOwner;
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

	public Double getEnginePower() {
		return enginePower;
	}

	public void setEnginePower(Double enginePower) {
		this.enginePower = enginePower;
	}

	public Integer getNumberOfOwner() {
		return numberOfOwner;
	}

	public void setNumberOfOwner(Integer numberOfOwner) {
		this.numberOfOwner = numberOfOwner;
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", productionYear=" + productionYear + ", mileage=" + mileage
				+ ", fuelType=" + fuelType + ", enginePower=" + enginePower + ", numberOfOwner=" + numberOfOwner + "]";
	}

}
