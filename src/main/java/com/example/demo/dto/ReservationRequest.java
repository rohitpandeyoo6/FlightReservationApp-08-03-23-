package com.example.demo.dto;

public class ReservationRequest {
private long flightId;
private String firstName;
private String middleName;
private String lastName;
private String email;
private String phone;
private String name;
private String cardNumber;
private String cvvCode;
private String expiryDate;
public long getFlightId() {
	return flightId;
}
public void setFlightId(long flightId) {
	this.flightId = flightId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCardNumber() {
	return cardNumber;
}
public void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
public String getCvvCode() {
	return cvvCode;
}
public void setCvvCode(String cvvCode) {
	this.cvvCode = cvvCode;
}
public String getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
}
