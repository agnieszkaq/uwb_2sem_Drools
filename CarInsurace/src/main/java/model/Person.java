package model;


public class Person {
 
	Integer age;
	String gender;
	String maritalStatus;
	String voivodeship;
	Boolean hasKids = false;
	
	public Person(Integer age, String gender, String maritalStatus, String voivodeship, Boolean hasKids) {
		super();
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.voivodeship = voivodeship;
		this.hasKids = hasKids;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", voivodeship="
				+ voivodeship + ", hasKids=" + hasKids + "]";
	}
	
}
