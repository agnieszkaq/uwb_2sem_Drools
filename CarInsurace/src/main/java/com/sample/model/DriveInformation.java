package com.sample.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DriveInformation {

	private GregorianCalendar driveLicenceDate;
	private Boolean isCullet = false;
	public Integer dateInYearsfromToday;

	public DriveInformation(GregorianCalendar driveLicenceDate, Boolean isCullet) {
		this.driveLicenceDate = driveLicenceDate;
		this.isCullet = isCullet;
		getDateInYearsfromToday();
	}

	public GregorianCalendar getDriveLicenceDate() {
		return driveLicenceDate;
	}

	public void setDriveLicenceDate(GregorianCalendar driveLicenceDate) {
		this.driveLicenceDate = driveLicenceDate;
	}

	public Boolean getIsCullet() {
		return isCullet;
	}

	public void setIsCullet(Boolean isCullet) {
		this.isCullet = isCullet;
	}

	public void getDateInYearsfromToday() {
		Calendar today = new GregorianCalendar();
		today.setTime(new Date());
		int yearsInBetween = today.get(Calendar.YEAR) - getDriveLicenceDate().get(Calendar.YEAR);
		dateInYearsfromToday = yearsInBetween;
	}

	@Override
	public String toString() {
		return "DriveInformation [driveLicenceDate=" + driveLicenceDate + ", isCullet=" + isCullet + "]";
	}

}
