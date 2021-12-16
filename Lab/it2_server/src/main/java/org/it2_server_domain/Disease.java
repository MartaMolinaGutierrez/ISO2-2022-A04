package org.it2_server_domain;


import java.util.Arrays;
import java.util.Date;

/************************
 * 
 * @author Elena & Luis Javier
 * @version 0.1.0
 *
 */
public class Disease {

	private String name;
	private String[] symptoms;
	private Date[] seasonality;
	private String[] medicines;
	public Disease(String name, String[] symptoms, Date[] seasonality, String[] medicines) {
		this.name = name;
		this.symptoms = symptoms;
		this.seasonality = seasonality;
		this.medicines = medicines;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String[] symptoms) {
		this.symptoms = symptoms;
	}
	public Date[] getSeasonality() {
		return seasonality;
	}
	public void setSeasonality(Date[] seasonality) {
		this.seasonality = seasonality;
	}
	public String[] getMedicines() {
		return medicines;
	}
	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}
	@Override
	public String toString() {
		return "Disease [name=" + name + ", symptoms=" + Arrays.toString(symptoms) + ", seasonality="
				+ Arrays.toString(seasonality) + ", medicines=" + Arrays.toString(medicines) + "]";
	}
	
	

}