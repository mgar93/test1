package domain;
import java.util.List;

public class Person {
	
	public 
private User user;
private String firstName;
private String Surname;
private String pesel;
private String email;
private List <Address> addresses;
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String getPesel() {
	return pesel;
}
public void setPesel(String pesel) {
	this.pesel = pesel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public List<Address> getAddresses() {
	return addresses;
}
public void setAddresses(List<Address> addresses) {
	this.addresses = addresses;
}



}
