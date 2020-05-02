package com.sample.model;

import java.util.GregorianCalendar;

public class DriveInformation {
	
	private GregorianCalendar driveLicenceDate;
	private Boolean isCullet = false;
	private Integer culletNumber = 0;
	
	public DriveInformation(GregorianCalendar driveLicenceDate, Boolean isCullet, Integer culletNumber) {
		this.driveLicenceDate = driveLicenceDate;
		this.isCullet = isCullet;
		this.culletNumber = culletNumber;
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
	public Integer getCulletNumber() {
		return culletNumber;
	}
	public void setCulletNumber(Integer culletNumber) {
		this.culletNumber = culletNumber;
	}
	@Override
	public String toString() {
		return "DriveInformation [driveLicenceDate=" + driveLicenceDate + ", isCullet=" + isCullet + ", culletNumber="
				+ culletNumber + "]";
	}
	
}
