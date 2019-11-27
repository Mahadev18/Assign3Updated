package com.example.Springjpahibernate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationservice;
	
	//Retrieving all the location
	@RequestMapping(method = RequestMethod.GET,value = "/location/all")
	public List<Location> getAllLocation()
	{
		return locationservice.getAll();
	}
	
	//Retrieving the particular locations
	@RequestMapping(method = RequestMethod.GET, value = "/location/{location_id}")
	public Optional<Location> getLocation(@PathVariable int location_id)
	{
		return locationservice.getLocation(location_id);
	}
	
	//Adding the particular location
	@RequestMapping(method = RequestMethod.POST,value = "/location")
	public void addLocation(@RequestBody Location location)
	{
		locationservice.addLocation(location);
	}
	
	//deleting the particular location
	@RequestMapping(method = RequestMethod.DELETE,value = "/location/{location_id}")
	public void deleteLocation(@PathVariable int location_id)
	{
		locationservice.deleteLocation(location_id);
	}	
	
}
