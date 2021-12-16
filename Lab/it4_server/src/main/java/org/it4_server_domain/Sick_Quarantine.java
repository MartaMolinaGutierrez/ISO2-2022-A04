/*******
 * 
 * @author Marta & Ismael
 * @version 0.1.0
 *
 */
package org.it4_server_domain;

import java.util.Arrays;

public class Sick_Quarantine extends Patient {

	private double quarantineLength;

	public double getQuarantineLength() {
		return quarantineLength;
	}

	public void setQuarantineLength(double quarantineLength) {
		this.quarantineLength = quarantineLength;
	}

	public Sick_Quarantine(String name, String iD, int phone, String[] state, double quarantineLength) {
		super(name, iD, phone, state);
		this.quarantineLength = quarantineLength;
	}

	@Override
	public String toString() {
		return "Sick_Quarantine [quarantineLength=" + quarantineLength + ", getQuarantineLength()="
				+ getQuarantineLength() + ", getName()=" + getName() + ", getID()=" + getID() + ", getPhone()="
				+ getPhone() + ", getState()=" + Arrays.toString(getState()) + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
