package com.witek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weight {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String firstname;
private String surname;
private int weight;

public Weight() {}
public Weight(String firstname, String surname, int weight) {
	this.firstname=firstname;
	this.surname=surname;
	this.weight=weight;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
	result = prime * result + (int) (id ^ (id >>> 32));
	result = prime * result + ((surname == null) ? 0 : surname.hashCode());
	result = prime * result + weight;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Weight other = (Weight) obj;
	if (firstname == null) {
		if (other.firstname != null)
			return false;
	} else if (!firstname.equals(other.firstname))
		return false;
	if (id != other.id)
		return false;
	if (surname == null) {
		if (other.surname != null)
			return false;
	} else if (!surname.equals(other.surname))
		return false;
	if (weight != other.weight)
		return false;
	return true;
}
@Override
public String toString() {
	return "Weight [id=" + id + ", firstname=" + firstname + ", surname=" + surname + ", weight=" + weight + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
	
}
