package com.sample;

import java.util.GregorianCalendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Car;
import com.sample.model.DriveInformation;
import com.sample.model.InsurancePrice;
import com.sample.model.Person;
import com.sample.model.Policyholder;

public class CarInsurance {

	public static void main(String[] args) {

		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			Person person1 = new Person(24, "Female", "mrried", false);
			Car car1 = new Car("Audi", 2020, 970.0, "LPG", 3.20, 1);
			DriveInformation driveInfo1 = new DriveInformation(new GregorianCalendar(1952, 5, 4), true, 1);
			Policyholder policyholder = new Policyholder(person1, car1, driveInfo1);

			
			InsurancePrice insurancePrice = new InsurancePrice(0.0);

			kSession.insert(insurancePrice);
			kSession.insert(policyholder);
			kSession.fireAllRules();

			System.out.println(insurancePrice.toString());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
