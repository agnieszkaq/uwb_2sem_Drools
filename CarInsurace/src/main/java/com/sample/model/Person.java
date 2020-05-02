package com.sample.model;

public class Person {

	public int age;
	public String gender;
	public String maritalStatus;
	public Boolean hasKids = false;

	public Person(int age, String gender, String maritalStatus, Boolean hasKids) {
		super();
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.hasKids = hasKids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Boolean getHasKids() {
		return hasKids;
	}

	public void setHasKids(Boolean hasKids) {
		this.hasKids = hasKids;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", hasKids=" + hasKids
				+ "]";
	}

}
