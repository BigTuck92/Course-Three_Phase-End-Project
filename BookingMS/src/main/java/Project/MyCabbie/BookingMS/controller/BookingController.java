package Project.MyCabbie.BookingMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.MyCabbie.BookingMS.config.FeignService;
import Project.MyCabbie.BookingMS.model.Booking;
import Project.MyCabbie.BookingMS.service.BookingService;

@RestController
@RequestMapping(path="book")
@CrossOrigin(origins="http://localhost:4200")
public class BookingController {
	
	// Fields
	@Autowired
	private FeignService feignService;
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping
	public ResponseEntity<Booking> bookCab(@RequestBody Booking booking){
		
		ResponseEntity<Double> fare = feignService.calculateFare(booking.getCabRate(), booking.getDistance());
		booking.setTotalFare(fare.getBody());
		
		bookingService.saveBooking(booking);
		
		return new ResponseEntity<Booking>(booking, HttpStatus.OK);
	}

}
