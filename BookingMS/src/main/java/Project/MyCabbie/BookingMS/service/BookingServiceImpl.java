package Project.MyCabbie.BookingMS.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project.MyCabbie.BookingMS.dao.BookingRepository;
import Project.MyCabbie.BookingMS.model.Booking;

@Service
public class BookingServiceImpl implements BookingService{

	// Fields
	@Autowired
	private BookingRepository bookingRepository;
	
	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.save(booking);
	}

	@Override
	public Optional<Booking> getBookingById(Integer id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id);
	}

	@Override
	public List<Booking> getAllBookings() {
		// TODO Auto-generated method stub
		return new ArrayList<Booking>((Collection<? extends Booking>) bookingRepository.findAll());
	}

	@Override
	public void deleteBooking(Integer id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}

}
