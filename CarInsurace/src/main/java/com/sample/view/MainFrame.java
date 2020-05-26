package com.sample.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import datechooser.beans.DateChooserCombo;

import com.sample.model.Car;
import com.sample.model.DriveInformation;
import com.sample.model.InsurancePrice;
import com.sample.model.Person;
import com.sample.model.Policyholder;
import com.toedter.calendar.JYearChooser;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.awt.Label;

public class MainFrame extends JFrame {
	private JTextField enginePowerTextField;
	private JYearChooser productionYearChooser;

	public MainFrame() {
		getContentPane().setForeground(Color.DARK_GRAY);
		getContentPane().setFont(new Font("Calibri", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 695);

		this.setTitle("System regu³ wspomagaj¹cy ubezpieczanie samochodów.");
		getContentPane().setLayout(null);

		JLabel lblA = new JLabel(
				"<html>Autorzy: Agnieszka Kurel i Pawe³ Czeczot.<br/>Projekt zaliczeniowy z przedmiotu \"Systemy ekspertowe\".<br/>Instytut Informatyki, UwB, 2020.06</html>");
		lblA.setFont(new Font("Calibri", Font.PLAIN, 11));
		lblA.setBounds(10, 585, 304, 71);
		getContentPane().add(lblA);

		JSeparator separator = new JSeparator();
		separator.setBounds(-11, 591, 581, 2);
		getContentPane().add(separator);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(-11, 0, 581, 58);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblInformacjeOUbezpieczajcym = new JLabel("Informacje o ubezpieczaj\u0105cym si\u0119:");
		lblInformacjeOUbezpieczajcym.setBackground(new Color(255, 255, 255));
		lblInformacjeOUbezpieczajcym.setForeground(new Color(255, 255, 255));
		lblInformacjeOUbezpieczajcym.setFont(new Font("Calibri", Font.BOLD, 18));
		lblInformacjeOUbezpieczajcym.setBounds(43, 11, 325, 36);
		panel.add(lblInformacjeOUbezpieczajcym);

		JLabel ageLabel = new JLabel("Wiek: 18 lat");
		ageLabel.setForeground(Color.DARK_GRAY);
		ageLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		ageLabel.setBounds(25, 69, 77, 26);
		getContentPane().add(ageLabel);

		JSlider ageSlider = new JSlider();
		ageSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int sliderValue = ageSlider.getValue();
				ageLabel.setText("Wiek: " + sliderValue + " lat");
			}
		});
		ageSlider.setValue(0);
		ageSlider.setMinimum(18);
		ageSlider.setMajorTickSpacing(1);
		ageSlider.setPaintTicks(true);
		ageSlider.setForeground(new Color(0, 100, 0));
		ageSlider.setBackground(new Color(255, 255, 255));
		ageSlider.setBounds(112, 69, 340, 26);
		getContentPane().add(ageSlider);

		JLabel genderLbl = new JLabel("P\u0142e\u0107:");
		genderLbl.setForeground(Color.DARK_GRAY);
		genderLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		genderLbl.setBounds(25, 118, 66, 26);
		getContentPane().add(genderLbl);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 255, 255));
		separator_1.setBounds(10, 106, 540, 11);
		getContentPane().add(separator_1);

		JRadioButton genderFemaleRdbtn = new JRadioButton("Kobieta");
		genderFemaleRdbtn.setSelected(true);
		genderFemaleRdbtn.setForeground(Color.DARK_GRAY);
		genderFemaleRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		genderFemaleRdbtn.setBounds(74, 119, 76, 24);
		getContentPane().add(genderFemaleRdbtn);

		JRadioButton genderMaleRdbtn = new JRadioButton("M\u0119\u017Cczyzna");
		genderMaleRdbtn.setForeground(Color.DARK_GRAY);
		genderMaleRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		genderMaleRdbtn.setBounds(151, 120, 109, 23);
		getContentPane().add(genderMaleRdbtn);

		genderFemaleRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (genderFemaleRdbtn.isSelected()) {
					genderMaleRdbtn.setSelected(false);
				}
			}
		});

		genderMaleRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (genderMaleRdbtn.isSelected()) {
					genderFemaleRdbtn.setSelected(false);
				}
			}
		});

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(10, 151, 540, 11);
		getContentPane().add(separator_2);

		JLabel hasKidsLbl = new JLabel("Potomstwo:");
		hasKidsLbl.setForeground(Color.DARK_GRAY);
		hasKidsLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		hasKidsLbl.setBounds(25, 157, 116, 26);
		getContentPane().add(hasKidsLbl);

		JRadioButton hasKidsTrueRdbtn = new JRadioButton("TAK");
		hasKidsTrueRdbtn.setSelected(true);
		hasKidsTrueRdbtn.setForeground(Color.DARK_GRAY);
		hasKidsTrueRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		hasKidsTrueRdbtn.setBounds(112, 158, 49, 24);
		getContentPane().add(hasKidsTrueRdbtn);

		JRadioButton hasKidsFalseRdbtn = new JRadioButton("NIE");
		hasKidsFalseRdbtn.setForeground(Color.DARK_GRAY);
		hasKidsFalseRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		hasKidsFalseRdbtn.setBounds(164, 158, 96, 24);
		getContentPane().add(hasKidsFalseRdbtn);

		hasKidsTrueRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hasKidsTrueRdbtn.isSelected()) {
					hasKidsFalseRdbtn.setSelected(false);
				}
			}
		});

		hasKidsFalseRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hasKidsFalseRdbtn.isSelected()) {
					hasKidsTrueRdbtn.setSelected(false);
				}
			}
		});

		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(10, 194, 540, 11);
		getContentPane().add(separator_3);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 100, 0));
		panel_1.setBounds(-11, 197, 581, 58);
		getContentPane().add(panel_1);

		JLabel lblInformacjeOSamochodzie = new JLabel("Informacje o samochodzie:");
		lblInformacjeOSamochodzie.setForeground(Color.WHITE);
		lblInformacjeOSamochodzie.setFont(new Font("Calibri", Font.BOLD, 18));
		lblInformacjeOSamochodzie.setBackground(Color.WHITE);
		lblInformacjeOSamochodzie.setBounds(39, 11, 325, 36);
		panel_1.add(lblInformacjeOSamochodzie);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 100, 0));
		panel_2.setBounds(-11, 374, 581, 58);
		getContentPane().add(panel_2);

		JLabel lblInformacjeOZdolnoci = new JLabel("Informacje o zdolno\u015Bci jazdy:");
		lblInformacjeOZdolnoci.setForeground(Color.WHITE);
		lblInformacjeOZdolnoci.setFont(new Font("Calibri", Font.BOLD, 18));
		lblInformacjeOZdolnoci.setBackground(Color.WHITE);
		lblInformacjeOZdolnoci.setBounds(39, 11, 325, 36);
		panel_2.add(lblInformacjeOZdolnoci);

		JButton calculateBtn = new JButton("Przelicz ubezpieczenie");
		calculateBtn.setForeground(new Color(255, 255, 255));
		calculateBtn.setBackground(new Color(128, 0, 0));
		calculateBtn.setFont(new Font("Calibri", Font.BOLD, 17));
		calculateBtn.setBounds(25, 521, 321, 53);
		getContentPane().add(calculateBtn);

		String modelName[] = { "Audi", "BMW", "Mercedes", "Honda", "Nissan", "Ford" };
		JComboBox modelNameComboBox = new JComboBox(modelName);
		modelNameComboBox.setFont(new Font("Calibri", Font.BOLD, 14));
		modelNameComboBox.setBounds(74, 269, 91, 20);
		getContentPane().add(modelNameComboBox);

		JLabel isCulletLbl = new JLabel("Czy kiedykolwiek mia\u0142e\u015B st\u0142uczk\u0119?");
		isCulletLbl.setForeground(Color.DARK_GRAY);
		isCulletLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		isCulletLbl.setBounds(25, 438, 208, 26);
		getContentPane().add(isCulletLbl);

		JRadioButton isCulletTrueRdbtn = new JRadioButton("TAK");
		isCulletTrueRdbtn.setSelected(true);
		isCulletTrueRdbtn.setForeground(Color.DARK_GRAY);
		isCulletTrueRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		isCulletTrueRdbtn.setBounds(230, 439, 49, 24);
		getContentPane().add(isCulletTrueRdbtn);

		JRadioButton isCulletRdbtn = new JRadioButton("NIE");
		isCulletRdbtn.setForeground(Color.DARK_GRAY);
		isCulletRdbtn.setFont(new Font("Calibri", Font.BOLD, 14));
		isCulletRdbtn.setBounds(281, 439, 96, 24);
		getContentPane().add(isCulletRdbtn);

		isCulletTrueRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isCulletTrueRdbtn.isSelected()) {
					isCulletRdbtn.setSelected(false);
				}
			}
		});

		isCulletRdbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (isCulletRdbtn.isSelected()) {
					isCulletTrueRdbtn.setSelected(false);
				}
			}
		});

		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(10, 465, 540, 11);
		getContentPane().add(separator_4);

		JLabel driveLicenceDateLbl = new JLabel("Data wydania prawa jazdy:");
		driveLicenceDateLbl.setForeground(Color.DARK_GRAY);
		driveLicenceDateLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		driveLicenceDateLbl.setBounds(25, 484, 173, 26);
		getContentPane().add(driveLicenceDateLbl);

		DateChooserCombo dateChooserCombo = new DateChooserCombo();
		dateChooserCombo.setBounds(191, 490, 155, 20);
		getContentPane().add(dateChooserCombo);

		JLabel modelNameLbl = new JLabel("Marka:");
		modelNameLbl.setForeground(Color.DARK_GRAY);
		modelNameLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		modelNameLbl.setBounds(25, 266, 116, 26);
		getContentPane().add(modelNameLbl);

		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(10, 300, 540, 11);
		getContentPane().add(separator_5);

		JLabel productionYearLbl = new JLabel("Rocznik:");
		productionYearLbl.setForeground(Color.DARK_GRAY);
		productionYearLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		productionYearLbl.setBounds(324, 266, 53, 26);
		getContentPane().add(productionYearLbl);

		productionYearChooser = new JYearChooser();
		productionYearChooser.setBounds(386, 269, 77, 20);
		getContentPane().add(productionYearChooser);

		JLabel fuelTypeLbl = new JLabel("Paliwo:");
		fuelTypeLbl.setForeground(Color.DARK_GRAY);
		fuelTypeLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		fuelTypeLbl.setBounds(176, 266, 57, 26);
		getContentPane().add(fuelTypeLbl);

		String fuelType[] = { "LPG", "PG+LPG", "PB", "ON" };
		JComboBox fuelTypeComboBox = new JComboBox(fuelType);
		fuelTypeComboBox.setBounds(223, 269, 91, 20);
		getContentPane().add(fuelTypeComboBox);

		JLabel mileageLbl = new JLabel("Wpisz przebieg w km:");
		mileageLbl.setForeground(Color.DARK_GRAY);
		mileageLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		mileageLbl.setBounds(25, 309, 139, 26);
		getContentPane().add(mileageLbl);

		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(10, 335, 540, 11);
		getContentPane().add(separator_6);

		JLabel numberOfOwnerLbl = new JLabel("Liczba w\u0142a\u015Bcicieli:");
		numberOfOwnerLbl.setForeground(Color.DARK_GRAY);
		numberOfOwnerLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		numberOfOwnerLbl.setBounds(25, 346, 116, 26);
		getContentPane().add(numberOfOwnerLbl);

		String numberOfOwners[] = { "1", "2 lub wiêcej" };
		JComboBox numberOfOwnerComboBox = new JComboBox(numberOfOwners);
		numberOfOwnerComboBox.setFont(new Font("Calibri", Font.BOLD, 14));
		numberOfOwnerComboBox.setBounds(142, 346, 160, 20);
		getContentPane().add(numberOfOwnerComboBox);

		JTextField mileageTextField = new JTextField();
		mileageTextField.setText("0.0");
		mileageTextField.setBounds(163, 312, 86, 20);
		getContentPane().add(mileageTextField);
		mileageTextField.setColumns(10);

		JLabel enginePowerLbl = new JLabel("Wpisz moc silnika:");
		enginePowerLbl.setForeground(Color.DARK_GRAY);
		enginePowerLbl.setFont(new Font("Calibri", Font.BOLD, 14));
		enginePowerLbl.setBounds(270, 309, 139, 26);
		getContentPane().add(enginePowerLbl);

		enginePowerTextField = new JTextField();
		enginePowerTextField.setText("0.0");
		enginePowerTextField.setColumns(10);
		enginePowerTextField.setBounds(386, 312, 86, 20);
		getContentPane().add(enginePowerTextField);

		JLabel insucurePriceInfo = new JLabel("<html>Cena ubezpieczenia<br/>wyniesie oko\u0142o: </html>",
				SwingConstants.CENTER);
		insucurePriceInfo.setForeground(Color.DARK_GRAY);
		insucurePriceInfo.setFont(new Font("Calibri", Font.PLAIN, 18));
		insucurePriceInfo.setBounds(341, 465, 191, 58);
		insucurePriceInfo.setVisible(false);
		getContentPane().add(insucurePriceInfo);

		Label insucurPriceNumber = new Label("0.00 z\u0142");
		insucurPriceNumber.setAlignment(Label.CENTER);
		insucurPriceNumber.setForeground(new Color(255, 255, 255));
		insucurPriceNumber.setBackground(new Color(210, 105, 30));
		insucurPriceNumber.setFont(new Font("Calibri", Font.BOLD, 21));
		insucurPriceNumber.setBounds(352, 521, 179, 53);
		getContentPane().add(insucurPriceNumber);

		calculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("\n___ Calculate button click: ___");

				String modelName = (String) modelNameComboBox.getSelectedItem();
				Integer productionYear = productionYearChooser.getValue();
				String mileage = mileageTextField.getText();
				String fuelType = (String) fuelTypeComboBox.getSelectedItem();
				String enginePower = enginePowerTextField.getText();
				Integer numberOfOwner = numberOfOwnerComboBox.getSelectedIndex() + 1;
				int age = ageSlider.getValue();

				String gender;
				if (genderFemaleRdbtn.isSelected()) {
					gender = "female";
				} else
					gender = "male";

				Boolean hasKids;
				if (hasKidsTrueRdbtn.isSelected()) {
					hasKids = true;
				} else
					hasKids = false;

				GregorianCalendar driveLicenceDate = (GregorianCalendar) dateChooserCombo.getSelectedDate()
						.getInstance();

				Boolean isCullet;
				if (isCulletTrueRdbtn.isSelected()) {
					isCullet = true;
				} else
					isCullet = false;
				
				double doubleMileage = Double.parseDouble(mileageTextField.getText());
				double doubleEnginePower = Double.parseDouble(enginePowerTextField.getText());

				System.out.println(" Model: " + modelName + "\n Production year " + productionYear + "\n Mileage: "
						+ doubleMileage + "\n Fuel type: " + fuelType + "\n Engine power: " + doubleEnginePower
						+ "\n Number of owner: " + numberOfOwner + "\n Driver age: " + age + "\n Has kids?: " + hasKids
						+ "\n Drive licence date: " + driveLicenceDate + "\n Is cullet?: " + isCullet);

				insucurePriceInfo.setVisible(true);

				Person person1 = new Person(age, gender, hasKids);
				Car car1 = new Car(modelName, productionYear, doubleMileage, fuelType, doubleEnginePower, numberOfOwner);
				DriveInformation driveInfo1 = new DriveInformation(driveLicenceDate, isCullet);
				Policyholder policyholder1 = new Policyholder(person1, car1, driveInfo1);

				InsurancePrice insurancePrice1 = new InsurancePrice(0.0);

				KieServices ks = KieServices.Factory.get();
				KieContainer kContainer = ks.getKieClasspathContainer();
				KieSession kSession = kContainer.newKieSession("ksession-rules");

				kSession.insert(insurancePrice1);
				kSession.insert(policyholder1);
				kSession.fireAllRules();
				int price = insurancePrice1.getPrice().intValue();

				insucurPriceNumber.setText(Integer.toString(price) + ",00 z³");

				System.out.println(insurancePrice1.toString());

			}
		});

	}
}
