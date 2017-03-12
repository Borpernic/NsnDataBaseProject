package ru.nsn.model;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty street;
	private final IntegerProperty postalCode;
	private final StringProperty city;
	private final ObjectProperty<LocalDate> birthday;
	private final IntegerProperty age;

	public Person() {
		this(null, null);
	}

	public Person(String firstName, String lastName) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.age = new SimpleIntegerProperty(1234);
		// Какие-то фиктивные начальные данные для удобства тестирования.
		this.street = new SimpleStringProperty("какая-то улица");
		this.postalCode = new SimpleIntegerProperty(1234);
		this.city = new SimpleStringProperty("какой-то город");
		this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	}

	public final StringProperty firstNameProperty() {
		return this.firstName;
	}
	

	public final String getFirstName() {
		return this.firstNameProperty().get();
	}
	

	public final void setFirstName(final String firstName) {
		this.firstNameProperty().set(firstName);
	}
	

	public final StringProperty lastNameProperty() {
		return this.lastName;
	}
	

	public final String getLastName() {
		return this.lastNameProperty().get();
	}
	

	public final void setLastName(final String lastName) {
		this.lastNameProperty().set(lastName);
	}
	

	public final StringProperty streetProperty() {
		return this.street;
	}
	

	public final String getStreet() {
		return this.streetProperty().get();
	}
	

	public final void setStreet(final String street) {
		this.streetProperty().set(street);
	}
	

	public final IntegerProperty postalCodeProperty() {
		return this.postalCode;
	}
	

	public final int getPostalCode() {
		return this.postalCodeProperty().get();
	}
	

	public final void setPostalCode(final int postalCode) {
		this.postalCodeProperty().set(postalCode);
	}
	

	public final StringProperty cityProperty() {
		return this.city;
	}
	

	public final String getCity() {
		return this.cityProperty().get();
	}
	

	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	

	public final ObjectProperty<LocalDate> birthdayProperty() {
		return this.birthday;
	}
	

	public final LocalDate getBirthday() {
		return this.birthdayProperty().get();
	}
	

	public final void setBirthday(final LocalDate birthday) {
		this.birthdayProperty().set(birthday);
	}

	public final IntegerProperty ageProperty() {
		return this.age;
	}
	

	public final int getAge() {
		return this.ageProperty().get();
	}
	

	public final void setAge(final int age) {
		this.ageProperty().set(age);
	}
	
	//ВВАПВАПВКАП 
		
	
}
