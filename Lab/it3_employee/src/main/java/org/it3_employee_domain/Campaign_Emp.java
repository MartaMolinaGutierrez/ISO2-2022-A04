package org.it3_employee_domain;

import java.util.Arrays;
import java.util.Date;

import org.it2_server_domain.Disease;

/*******
 * 
 * @author Elena & Luis Javier
 * @version 0.1.0
 *
 */
public class Campaign_Emp {
	private int ID;
	private Double cost;
	private Date[] timing;
	private String efectiveness;
	private Disease disease;
	private int doses;
	public Campaign_Emp(int iD, Double cost, Date[] timing, String efectiveness, Disease disease, int doses) {
		ID = iD;
		this.cost = cost;
		this.timing = timing;
		this.efectiveness = efectiveness;
		this.disease = disease;
		this.doses = doses;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Date[] getTiming() {
		return timing;
	}
	public void setTiming(Date[] timing) {
		this.timing = timing;
	}
	public String getEfectiveness() {
		return efectiveness;
	}
	public void setEfectiveness(String efectiveness) {
		this.efectiveness = efectiveness;
	}
	public Disease getDisease() {
		return disease;
	}
	public void setDisease(Disease disease) {
		this.disease = disease;
	}
	public int getDoses() {
		return doses;
	}
	public void setDoses(int doses) {
		this.doses = doses;
	}
	@Override
	public String toString() {
		return "Campaign_Emp [ID=" + ID + ", cost=" + cost + ", timing=" + Arrays.toString(timing) + ", efectiveness="
				+ efectiveness + ", disease=" + disease + ", doses=" + doses + "]";
	}
	
	
}
