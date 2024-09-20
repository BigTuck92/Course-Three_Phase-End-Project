package Project.MyCabbie.BookingMS.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Cab {

	// Fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String type;
	private Integer rate;
	
	// Constructors
	public Cab() {
		super();
	}

	public Cab(Integer id, String type, Integer rate) {
		super();
		this.id = id;
		this.type = type;
		this.rate = rate;
	}

	
	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Cab [id=" + id + ", type=" + type + ", rate=" + rate + "]";
	}
	
	
	
}
