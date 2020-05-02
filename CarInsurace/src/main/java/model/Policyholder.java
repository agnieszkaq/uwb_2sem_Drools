package model;

public class Policyholder {

	private Person person;
	private Car car;
	
	public Policyholder(Person person, Car car, DriveInformation driveInfo) {
		super();
		this.person = person;
		this.car = car;
		this.driveInfo = driveInfo;
	}
	DriveInformation driveInfo;

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public DriveInformation getDriveInfo() {
		return driveInfo;
	}
	public void setDriveInfo(DriveInformation driveInfo) {
		this.driveInfo = driveInfo;
	}
	@Override
	public String toString() {
		return "Policyholder [person=" + person + ", car=" + car + ", driveInfo=" + driveInfo + "]";
	}
	
}
