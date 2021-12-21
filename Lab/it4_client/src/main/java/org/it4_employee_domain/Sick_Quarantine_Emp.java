/*******
 * 
 * @author Marta and Ismael
 * @version 0.1.0
 *
 */

package org.it4_employee_domain;

import java.util.Arrays;

public class Sick_Quarantine_Emp extends Patient_Emp {

	public Sick_Quarantine_Emp(String name, String iD, int phone, String[] state) {
		super(name, iD, phone, state);
		// TODO Auto-generated constructor stub
	}

	private double quarantine_length;

	public double getQuarantine_length() {
		return quarantine_length;
	}

	public void setQuarantine_length(double quarantine_length) {
		this.quarantine_length = quarantine_length;
	}

	@Override
	public String toString() {
		return "Sick_Quarantine_Emp [quarantine_length=" + quarantine_length + ", getQuarantine_length()="
				+ getQuarantine_length() + ", getName()=" + getName() + ", getID()=" + getID() + ", getPhone()="
				+ getPhone() + ", getState()=" + Arrays.toString(getState()) + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
