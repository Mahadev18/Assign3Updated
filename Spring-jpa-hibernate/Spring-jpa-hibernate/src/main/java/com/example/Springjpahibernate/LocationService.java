package com.example.Springjpahibernate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationrepository;
	
	//getting all the locations
	public List<Location> getAll() {
		return (List<Location>) locationrepository.findAll();
	}

	//retrieving the particular locations
	public Optional<Location> getLocation(int location_id) {
		return locationrepository.findById(location_id);
	}

	
	//adding the locations
	public void addLocation(Location location) {
		locationrepository.save(location);
		
	}

	//deleting the perticular location
	public void deleteLocation(int location_id) {
		locationrepository.deleteById(location_id);
		
	}

}
