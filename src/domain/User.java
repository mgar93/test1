package domain;

public class User {
	private String login;
	private String passwird;
	private Person person;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswird() {
		return passwird;
	}
	public void setPasswird(String passwird) {
		this.passwird = passwird;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
