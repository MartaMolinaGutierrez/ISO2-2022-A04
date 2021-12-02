/*******
 * 
 * @author Marta and Ismael
 * @version 0.2.0
 *
 */
package org.it4_employee_domain;

import java.util.Arrays;

public class Employee_Patient_Controller {

	private Patient_Emp[] patient_list;

	public Patient_Emp[] getPatient_list() {
		return patient_list;
	}

	public void setPatient_list(Patient_Emp[] patient_list) {
		this.patient_list = patient_list;
	}

	@Override
	public String toString() {
		return "Employee_Patient_Controller [patient_list=" + Arrays.toString(patient_list) + ", getPatient_list()="
				+ Arrays.toString(getPatient_list()) + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Employee_Patient_Controller(Patient_Emp[] patient_list) {
		super();
		this.patient_list = patient_list;
	}
	public void getPatientList() {
		// TODO - implement Employee_Patient_Controller.getPatientList
		throw new UnsupportedOperationException();
	}


}
