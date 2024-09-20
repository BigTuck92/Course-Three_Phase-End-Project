package Project.MyCabbie.BookingMS.controller;

import java.util.ArrayList;

import Project.MyCabbie.BookingMS.model.Cab;

public class ViewController {

	// Fields
	private Cab sedan = new Cab(null, "Sedan", 10);
	private Cab suv = new Cab(null, "SUV", 15);
	private Cab luxury = new Cab(null, "Luxury", 20);
	
	// Populate the Array List
	private ArrayList<Cab> cabs = new ArrayList<Cab>();
	
}
