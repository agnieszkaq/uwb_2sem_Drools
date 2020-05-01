package model;

import java.util.Date;

public class DriveInformation {
	
	Date driveLicenceDate;
	Boolean isCullet = false;
	Integer culletNumber = 0;
	
	public DriveInformation(Date driveLicenceDate, Boolean isCullet, Integer culletNumber) {
		this.driveLicenceDate = driveLicenceDate;
		this.isCullet = isCullet;
		this.culletNumber = culletNumber;
	}
	public Date getDriveLicenceDate() {
		return driveLicenceDate;
	}
	public void setDriveLicenceDate(Date driveLicenceDate) {
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
