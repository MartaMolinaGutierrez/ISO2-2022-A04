/*******
 * 
 * @author Marta & Ismael
 * @version 0.1.0
 *
 */

package org.it4_server_domain;

import java.util.Arrays;

public class Patient {

	private String name;
	private String ID;
	private int phone;
	private String[] state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String[] getState() {
		return state;
	}
	public void setState(String[] state) {
		this.state = state;
	}
	public Patient(String name, String iD, int phone, String[] state) {
		super();
		this.name = name;
		ID = iD;
		this.phone = phone;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", ID=" + ID + ", phone=" + phone + ", state=" + Arrays.toString(state)
				+ ", getName()=" + getName() + ", getID()=" + getID() + ", getPhone()=" + getPhone() + ", getState()="
				+ Arrays.toString(getState()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
