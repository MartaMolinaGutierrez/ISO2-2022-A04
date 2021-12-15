package org.it7_client_domain;

/******
 * 
 * @author Raúl, Marina, Luis Javier & Elena
 * @version 0.1.0
 *
 */
public class Vaccine {

	private String name;
	private double forecast_estimation;
	public Vaccine(String name, double forecast_estimation) {
		super();
		this.name = name;
		this.forecast_estimation = forecast_estimation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getForecast_estimation() {
		return forecast_estimation;
	}
	public void setForecast_estimation(double forecast_estimation) {
		this.forecast_estimation = forecast_estimation;
	}
	@Override
	public String toString() {
		return "Vaccine [name=" + name + ", forecast_estimation=" + forecast_estimation + "]";
	}
	
	
}
