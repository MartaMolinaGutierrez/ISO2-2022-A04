package org.it7_client_domain;

/******
 * 
 * @author Raúl, Marina, Luis Javier & Elena
 * @version 0.1.0
 *
 */
public class Stats {

	private int number_diseases;
	private int number_inf_campaigns;
	private double ratio_vaccinated;
	public Stats(int number_diseases, int number_inf_campaigns, double ratio_vaccinated) {
		super();
		this.number_diseases = number_diseases;
		this.number_inf_campaigns = number_inf_campaigns;
		this.ratio_vaccinated = ratio_vaccinated;
	}
	public int getNumber_diseases() {
		return number_diseases;
	}
	public void setNumber_diseases(int number_diseases) {
		this.number_diseases = number_diseases;
	}
	public int getNumber_inf_campaigns() {
		return number_inf_campaigns;
	}
	public void setNumber_inf_campaigns(int number_inf_campaigns) {
		this.number_inf_campaigns = number_inf_campaigns;
	}
	public double getRatio_vaccinated() {
		return ratio_vaccinated;
	}
	public void setRatio_vaccinated(double ratio_vaccinated) {
		this.ratio_vaccinated = ratio_vaccinated;
	}
	@Override
	public String toString() {
		return "Stats [number_diseases=" + number_diseases + ", number_inf_campaigns=" + number_inf_campaigns
				+ ", ratio_vaccinated=" + ratio_vaccinated + "]";
	}
	
	
}
