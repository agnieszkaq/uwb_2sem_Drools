package com.sample.view;

import java.util.GregorianCalendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Car;
import com.sample.model.DriveInformation;
import com.sample.model.InsurancePrice;
import com.sample.model.Person;
import com.sample.model.Policyholder;

public class RuleEngineHelper {

	private String modelName;
	private Integer productionYear;
	private Double mileage;
	private String fuelType;
	private Double enginePower;
	private Integer numberOfOwner;
	private Integer age;
	private String gender;
	private Boolean hasKids;
	private GregorianCalendar driveLicenceDate;
	private Boolean isCullet;
	private Policyholder policyholder;
	private InsurancePrice insurancePrice;

	public RuleEngineHelper(String modelName, Integer productionYear, Double mileage, String fuelType,
			Double enginePower, Integer numberOfOwner, Integer age, String gender, Boolean hasKids,
			GregorianCalendar driveLicenceDate, Boolean isCullet) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.mileage = mileage;
		this.fuelType = fuelType;
		this.enginePower = enginePower;
		this.numberOfOwner = numberOfOwner;
		this.age = age;
		this.gender = gender;
		this.hasKids = hasKids;
		this.driveLicenceDate = driveLicenceDate;
		this.isCullet = isCullet;
	}

	public void setVariables() {
		Person person1 = new Person(age, gender, hasKids);
		Car car1 = new Car(modelName, productionYear, mileage, fuelType, enginePower, numberOfOwner);
		DriveInformation driveInfo1 = new DriveInformation(driveLicenceDate, isCullet);
		this.policyholder = new Policyholder(person1, car1, driveInfo1);
		this.insurancePrice = new InsurancePrice(0.0);

	}

	public void runEngine() {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");

		kSession.insert(this.insurancePrice);
		kSession.insert(this.policyholder);
		kSession.fireAllRules();
	}

	public Integer getInsuracjePrice() {
		return this.insurancePrice.getPrice().intValue();
	}

}
