package Project.MyCabbie.BookingMS.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Project.MyCabbie.BookingMS.model.Cab;


@Controller
public class ViewController {

	// Fields
	private Cab sedan = new Cab(null, "Sedan", 10);
	private Cab suv = new Cab(null, "SUV", 15);
	private Cab luxury = new Cab(null, "Luxury", 20);
	private ArrayList<Cab> cabs = new ArrayList<Cab>();
	
	@GetMapping("")
	public String showCabs(Model model) {
		// Populate ArrayList
		cabs.add(sedan);
		cabs.add(suv);
		cabs.add(luxury);
		
		// Populate Model
		model.addAttribute("Cab", cabs);
		
		return null;
	}
	
}
