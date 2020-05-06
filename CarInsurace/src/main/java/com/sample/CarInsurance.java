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
			Person person1 = new Person(18, "female", false);
			Car car1 = new Car("Audi", 1997, 50001.0, "LPG", 3.20, 3);
			DriveInformation driveInfo1 = new DriveInformation(new GregorianCalendar(2020, 5, 4), true);
			Policyholder policyholder1 = new Policyholder(person1, car1, driveInfo1);

			InsurancePrice insurancePrice1 = new InsurancePrice(0.0);

			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			kSession.insert(insurancePrice1);
			kSession.insert(policyholder1);
			kSession.fireAllRules();

			System.out.println(insurancePrice1.toString());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
