package Project.MyCabbie.FareCalculationMS.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FareControllerTest {

	// Fields
	private FareController fareController = new FareController();
	
	// Methods
	@Test
	public void testCalculateFare() {
		Integer rate = 5;
		Integer distance = 20;
		double expectedFare = 100.0;
		
		assertEquals(new ResponseEntity<Double>(expectedFare, HttpStatus.OK), fareController.calculateFare(rate, distance));
	}
	
}
