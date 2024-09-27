package Project.MyCabbie.BookingMS.service;

import java.util.List;
import java.util.Optional;

import Project.MyCabbie.BookingMS.model.Booking;

public interface BookingService {

	Booking saveBooking(Booking booking);
	Optional<Booking> getBookingById(Integer id);
	List<Booking> getAllBookings();
	void deleteBooking(Integer id);
	
}
