package org.it1_server_domain;

/****
 * 
 * @author Elena & Luis Javier
 * @version 0.1.0
 *
 */
public class Person {

	private String userName;
	private String pass;
	private String type;
	public Person(String userName, String pass, String type) {
		this.userName = userName;
		this.pass = pass;
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Person [userName=" + userName + ", pass=" + pass + ", type=" + type + "]";
	}
	
	

}