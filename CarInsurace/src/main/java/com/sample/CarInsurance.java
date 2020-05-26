package com.sample;

import java.awt.EventQueue;
import java.util.GregorianCalendar;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.sample.model.Car;
import com.sample.model.DriveInformation;
import com.sample.model.InsurancePrice;
import com.sample.model.Person;
import com.sample.model.Policyholder;
import com.sample.view.MainFrame;

public class CarInsurance {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
