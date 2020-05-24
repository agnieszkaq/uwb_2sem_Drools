package com.sample.view;

import java.awt.EventQueue;

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
import datechooser.beans.DateChooserCombo;
import com.toedter.calendar.JYearChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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

		JLabel sliderAgeLabel = new JLabel("Wiek: 18 lat");
		sliderAgeLabel.setForeground(Color.DARK_GRAY);
		sliderAgeLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		sliderAgeLabel.setBounds(25, 69, 77, 26);
		getContentPane().add(sliderAgeLabel);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int sliderValue = slider.getValue();
				sliderAgeLabel.setText("Wiek: "+sliderValue+" lat");
			}
		});
		slider.setValue(0);
		slider.setMinimum(18);
		slider.setMajorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setForeground(new Color(0, 100, 0));
		slider.setBackground(new Color(255, 255, 255));
		slider.setBounds(112, 69, 340, 26);
		getContentPane().add(slider);

		JLabel lblPe = new JLabel("P\u0142e\u0107:");
		lblPe.setForeground(Color.DARK_GRAY);
		lblPe.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPe.setBounds(25, 118, 66, 26);
		getContentPane().add(lblPe);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 255, 255));
		separator_1.setBounds(10, 106, 540, 11);
		getContentPane().add(separator_1);

		JRadioButton rdbtnKobieta = new JRadioButton("Kobieta");
		rdbtnKobieta.setSelected(true);
		rdbtnKobieta.setForeground(Color.DARK_GRAY);
		rdbtnKobieta.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnKobieta.setBounds(74, 119, 76, 24);
		getContentPane().add(rdbtnKobieta);

		JRadioButton rdbtnMczyzna = new JRadioButton("M\u0119\u017Cczyzna");
		rdbtnMczyzna.setForeground(Color.DARK_GRAY);
		rdbtnMczyzna.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnMczyzna.setBounds(151, 120, 109, 23);
		getContentPane().add(rdbtnMczyzna);

		rdbtnKobieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnKobieta.isSelected()) {
					rdbtnMczyzna.setSelected(false);
				}
			}
		});

		rdbtnMczyzna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnMczyzna.isSelected()) {
					rdbtnKobieta.setSelected(false);
				}
			}
		});

		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(10, 151, 540, 11);
		getContentPane().add(separator_2);

		JLabel lblPotomstwo = new JLabel("Potomstwo:");
		lblPotomstwo.setForeground(Color.DARK_GRAY);
		lblPotomstwo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPotomstwo.setBounds(25, 157, 116, 26);
		getContentPane().add(lblPotomstwo);

		JRadioButton rdbtnTak = new JRadioButton("TAK");
		rdbtnTak.setSelected(true);
		rdbtnTak.setForeground(Color.DARK_GRAY);
		rdbtnTak.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnTak.setBounds(112, 158, 49, 24);
		getContentPane().add(rdbtnTak);

		JRadioButton rdbtnNie = new JRadioButton("NIE");
		rdbtnNie.setForeground(Color.DARK_GRAY);
		rdbtnNie.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnNie.setBounds(164, 158, 96, 24);
		getContentPane().add(rdbtnNie);

		rdbtnTak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnTak.isSelected()) {
					rdbtnNie.setSelected(false);
				}
			}
		});

		rdbtnNie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNie.isSelected()) {
					rdbtnTak.setSelected(false);
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

		JButton btnNewButton = new JButton("Przelicz ubezpieczenie");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 17));
		btnNewButton.setBounds(25, 521, 321, 53);
		getContentPane().add(btnNewButton);

		String modelName[] = { "Audi", "BMW", "Mercedes", "Honda", "Nissan", "Ford" };
		JComboBox comboBox = new JComboBox(modelName);
		comboBox.setFont(new Font("Calibri", Font.BOLD, 14));
		comboBox.setBounds(74, 269, 91, 20);
		getContentPane().add(comboBox);

		JLabel lblCzyKiedykolwiekMiae = new JLabel("Czy kiedykolwiek mia\u0142e\u015B st\u0142uczk\u0119?");
		lblCzyKiedykolwiekMiae.setForeground(Color.DARK_GRAY);
		lblCzyKiedykolwiekMiae.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCzyKiedykolwiekMiae.setBounds(25, 438, 208, 26);
		getContentPane().add(lblCzyKiedykolwiekMiae);

		JRadioButton rdbtnCarCrushTrue = new JRadioButton("TAK");
		rdbtnCarCrushTrue.setSelected(true);
		rdbtnCarCrushTrue.setForeground(Color.DARK_GRAY);
		rdbtnCarCrushTrue.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnCarCrushTrue.setBounds(230, 439, 49, 24);
		getContentPane().add(rdbtnCarCrushTrue);

		JRadioButton rdbtnCarCrushFalse = new JRadioButton("NIE");
		rdbtnCarCrushFalse.setForeground(Color.DARK_GRAY);
		rdbtnCarCrushFalse.setFont(new Font("Calibri", Font.BOLD, 14));
		rdbtnCarCrushFalse.setBounds(281, 439, 96, 24);
		getContentPane().add(rdbtnCarCrushFalse);
		
		rdbtnCarCrushTrue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCarCrushTrue.isSelected()) {
					rdbtnCarCrushFalse.setSelected(false);
				}
			}
		});
		
		rdbtnCarCrushFalse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnCarCrushFalse.isSelected()) {
					rdbtnCarCrushTrue.setSelected(false);
				}
			}
		});

		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(10, 465, 540, 11);
		getContentPane().add(separator_4);

		JLabel lblDataWydaniaPrawa = new JLabel("Data wydania prawa jazdy:");
		lblDataWydaniaPrawa.setForeground(Color.DARK_GRAY);
		lblDataWydaniaPrawa.setFont(new Font("Calibri", Font.BOLD, 14));
		lblDataWydaniaPrawa.setBounds(25, 484, 173, 26);
		getContentPane().add(lblDataWydaniaPrawa);

		DateChooserCombo dateChooserCombo = new DateChooserCombo();
		dateChooserCombo.setBounds(191, 490, 155, 20);
		getContentPane().add(dateChooserCombo);

		JLabel lblMarka = new JLabel("Marka:");
		lblMarka.setForeground(Color.DARK_GRAY);
		lblMarka.setFont(new Font("Calibri", Font.BOLD, 14));
		lblMarka.setBounds(25, 266, 116, 26);
		getContentPane().add(lblMarka);

		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(10, 300, 540, 11);
		getContentPane().add(separator_5);

		JLabel lblRocznik = new JLabel("Rocznik:");
		lblRocznik.setForeground(Color.DARK_GRAY);
		lblRocznik.setFont(new Font("Calibri", Font.BOLD, 14));
		lblRocznik.setBounds(324, 266, 53, 26);
		getContentPane().add(lblRocznik);

		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(386, 269, 77, 20);
		getContentPane().add(yearChooser);

		JLabel lblPaliwo = new JLabel("Paliwo:");
		lblPaliwo.setForeground(Color.DARK_GRAY);
		lblPaliwo.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPaliwo.setBounds(176, 266, 57, 26);
		getContentPane().add(lblPaliwo);

		String fuelType[] = { "LPG", "PG+LPG", "PB", "ON" };
		JComboBox comboBox_1 = new JComboBox(fuelType);
		comboBox_1.setBounds(223, 269, 91, 20);
		getContentPane().add(comboBox_1);

		JLabel lblPrzebieg = new JLabel("Wpisz przebieg w km:");
		lblPrzebieg.setForeground(Color.DARK_GRAY);
		lblPrzebieg.setFont(new Font("Calibri", Font.BOLD, 14));
		lblPrzebieg.setBounds(25, 309, 139, 26);
		getContentPane().add(lblPrzebieg);

		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(10, 335, 540, 11);
		getContentPane().add(separator_6);

		JLabel lblLiczbaWacicieli = new JLabel("Liczba w\u0142a\u015Bcicieli:");
		lblLiczbaWacicieli.setForeground(Color.DARK_GRAY);
		lblLiczbaWacicieli.setFont(new Font("Calibri", Font.BOLD, 14));
		lblLiczbaWacicieli.setBounds(25, 346, 116, 26);
		getContentPane().add(lblLiczbaWacicieli);

		String numberOfOwners[] = { "1", "2", "3 lub wiêcej" };
		JComboBox comboBox_2 = new JComboBox(numberOfOwners);
		comboBox_2.setFont(new Font("Calibri", Font.BOLD, 14));
		comboBox_2.setBounds(142, 346, 91, 20);
		getContentPane().add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(163, 312, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		

	}
}
