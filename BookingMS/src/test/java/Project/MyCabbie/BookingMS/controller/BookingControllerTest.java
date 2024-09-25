package Project.MyCabbie.BookingMS.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import Project.MyCabbie.BookingMS.model.Booking;

public class BookingControllerTest {

	// Fields
	private BookingController bookingController = new BookingController();
	
	// Methods
	@Test
	public void testBookCab() {
		Booking booking = new Booking(5, 20, null);
		Booking expectedBooking = new Booking(5, 20, 100.0);
	}
	
}
