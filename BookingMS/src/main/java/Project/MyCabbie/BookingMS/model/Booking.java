package Project.MyCabbie.BookingMS.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {

	// Fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

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
