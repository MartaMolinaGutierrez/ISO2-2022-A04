package org.it7_server_domain;
/******
 * 
 * @author Raúl, Marina, Luis Javier & Elena
 * @version 0.1.0
 *
 */
public class Stats {

	public int number_disease;
	public int number_inf_campaigns;
	public double ratio_vaccinated;
	public Stats(int number_disease, int number_inf_campaigns, double ratio_vaccinated) {
		super();
		this.number_disease = number_disease;
		this.number_inf_campaigns = number_inf_campaigns;
		this.ratio_vaccinated = ratio_vaccinated;
	}
	public int getNumber_disease() {
		return number_disease;
	}
	public void setNumber_disease(int number_disease) {
		this.number_disease = number_disease;
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
		return "Stats [number_disease=" + number_disease + ", number_inf_campaigns=" + number_inf_campaigns
				+ ", ratio_vaccinated=" + ratio_vaccinated + "]";
	}
	
	
}
