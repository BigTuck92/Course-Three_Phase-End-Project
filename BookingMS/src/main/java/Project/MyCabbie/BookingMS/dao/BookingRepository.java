package Project.MyCabbie.BookingMS.dao;

import org.springframework.data.repository.CrudRepository;

import Project.MyCabbie.BookingMS.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer>{

}
