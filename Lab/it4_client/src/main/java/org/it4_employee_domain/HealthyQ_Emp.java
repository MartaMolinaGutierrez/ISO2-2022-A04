/*******
 * 
 * @author Marta and Ismael
 * @version 0.1.0
 *
 */

package org.it4_employee_domain;

import java.util.Arrays;

public class HealthyQ_Emp extends Patient_Emp {

	public HealthyQ_Emp(String name, String iD, int phone, String[] state) {
		super(name, iD, phone, state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HealthyQ_Emp [getName()=" + getName() + ", getID()=" + getID() + ", getPhone()=" + getPhone()
				+ ", getState()=" + Arrays.toString(getState()) + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
