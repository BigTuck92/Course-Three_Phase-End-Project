package Project.MyCabbie.BookingMS.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@JsonIgnoreProperties
@Entity
public class Booking {

	// Fields
	@JsonProperty("bookingId")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@JsonProperty("cabRate")
	private Integer cabRate;
	@JsonProperty("distance")
	private Integer distance;
	@JsonProperty("totalFare")
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
