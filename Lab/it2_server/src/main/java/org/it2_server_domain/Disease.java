package org.it2_server_domain;


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
	

}