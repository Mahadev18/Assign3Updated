package com.example.Springjpahibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Location")
@Entity
public class Location  {  //POJO
	
	@Id
	@Column
	private int location_id;
	@Column
	private String location_name;
	@Column
	private String address;
	
	@OneToMany(mappedBy = "location" )
	private List<Vehicle> Vehicle;
	
	public Location() {
		super();
	}

	public Location(int location_id, String location_name, String address) {
		super();
		this.location_id = location_id;
		this.location_name = location_name;
		this.address = address;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
}
