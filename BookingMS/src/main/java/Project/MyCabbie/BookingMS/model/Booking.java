package Project.MyCabbie.BookingMS.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Booking {

	// Fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private Cab cab;
	private Integer distance;
	private Double fare;
	
	// Constructors
	public Booking() {
		super();
	}

	public Booking(Integer id, Cab cab, Double fare) {
		super();
		this.id = id;
		this.cab = cab;
		this.fare = fare;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	public Double getFare() {
		return fare;
	}

	public void setFare(Double fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", cab=" + cab + ", fare=" + fare + "]";
	}
	
	
	
}
