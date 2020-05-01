package com.sample;

import java.util.GregorianCalendar;

import model.Car;
import model.DriveInformation;
import model.Person;
import model.Policyholder;

public class CarInsurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person(24, "Female", "mrried", "Podlaskie", false);
		Car car = new Car("BMW", 2014, 97000.0, "LPG", 120, 0, 2020);
		DriveInformation driveInfo= new DriveInformation(new GregorianCalendar(1952, 5, 4), true, 1);
		Policyholder policyholder= new Policyholder(person, car, driveInfo);
		
		System.out.println(policyholder.toString());
	}

}
