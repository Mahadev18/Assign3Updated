package com.example.Springjpahibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleservice;
	
	List<Vehicle> al = new ArrayList<>();
	
	//Retrieve All
	@RequestMapping("/vehicle/all")
	public List<Vehicle> getAllVehicle()
	{
		al =vehicleservice.getVehicles();
		return al;
	}	
	
	//Retrieving the vehicles based on their ID
	@RequestMapping("/vehicle/{vehicle_id}")
	public Optional<Vehicle> getVehicle(@PathVariable int vehicle_id)
	{
		return vehicleservice.getVehicle(vehicle_id);
	}
	
	//Adding the vehicle into database
	@RequestMapping(method = RequestMethod.POST,value = "/vehicle")
	public void addVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleservice.addVehicle(vehicle);
	}
	
	//update vehicles details
	@RequestMapping(method = RequestMethod.PUT,value = "/vehicle/{location_id}")
	public void updateVehicle(@RequestBody Vehicle vehicle,@PathVariable int location_id)
	{
		vehicleservice.updateVehicle(vehicle,location_id);
	}
	
	//deleting the particular vehicle from the vehicle list
	@RequestMapping(method = RequestMethod.DELETE,value = "/vehicle/{vehicle_id}")
	public void deleteVehicle(@PathVariable int vehicle_id)
	{
		vehicleservice.deleteVehicle(vehicle_id);
	}
	
	
}
