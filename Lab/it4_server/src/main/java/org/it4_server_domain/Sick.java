/*******
 * 
 * @author Marta & Ismael
 * @version 0.1.0
 *
 */
package org.it4_server_domain;

import java.util.Arrays;

public class Sick extends Patient {

	private boolean need_quarantine;
	private String care_level;
	public boolean isNeed_quarantine() {
		return need_quarantine;
	}
	public void setNeed_quarantine(boolean need_quarantine) {
		this.need_quarantine = need_quarantine;
	}
	public String getCare_level() {
		return care_level;
	}
	public void setCare_level(String care_level) {
		this.care_level = care_level;
	}
	@Override
	public String toString() {
		return "Sick [need_quarantine=" + need_quarantine + ", care_level=" + care_level + ", isNeed_quarantine()="
				+ isNeed_quarantine() + ", getCare_level()=" + getCare_level() + ", getName()=" + getName()
				+ ", getID()=" + getID() + ", getPhone()=" + getPhone() + ", getState()=" + Arrays.toString(getState())
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	public Sick(String name, String iD, int phone, String[] state, boolean need_quarantine, String care_level) {
		super(name, iD, phone, state);
		this.need_quarantine = need_quarantine;
		this.care_level = care_level;
	}

}

