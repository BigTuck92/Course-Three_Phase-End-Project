package Project.MyCabbie.BookingMS.model;

import org.springframework.stereotype.Component;

@Component
public class Booking {

	// Fields
	private Integer cabRate;
	private Integer distance;
	private Double totalFare;
	
	// Constructors
	public Booking() {
		super();
	}

	public Booking(Integer cabRate, Integer distance, Double totalFare) {
		super();
		this.cabRate = cabRate;
		this.distance = distance;
		this.totalFare = totalFare;
	}

	// Getters and Setters
	public Integer getCabRate() {
		return cabRate;
	}

	public void setCabRate(Integer cabRate) {
		this.cabRate = cabRate;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(Double totalFare) {
		this.totalFare = totalFare;
	}

	@Override
	public String toString() {
		return "Booking [cabRate=" + cabRate + ", distance=" + distance + ", totalFare=" + totalFare + "]";
	}
	
	
	
}
