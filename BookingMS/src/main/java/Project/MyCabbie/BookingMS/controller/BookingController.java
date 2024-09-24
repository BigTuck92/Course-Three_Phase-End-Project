package Project.MyCabbie.BookingMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Project.MyCabbie.BookingMS.config.FeignService;
import Project.MyCabbie.BookingMS.model.Booking;

@RestController
@RequestMapping(path="book")
public class BookingController {
	
	// Fields
	@Autowired
	private FeignService feignService;
	
	public ResponseEntity<Booking> bookCab(@RequestBody Booking booking){
		
		ResponseEntity<Double> fare = feignService.calculateFare(booking.getCabRate(), booking.getDistance());
		booking.setTotalFare(fare.getBody());
		
		return new ResponseEntity<Booking>(booking, HttpStatus.OK);
	}

}
