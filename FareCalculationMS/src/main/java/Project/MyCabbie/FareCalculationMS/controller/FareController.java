package Project.MyCabbie.FareCalculationMS.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FareController {

	@GetMapping("/fare")
    public ResponseEntity<Double> calculateFare(@RequestParam Integer rate, @RequestParam Integer distance){
		
		Double fare = (double) (rate * distance);
		
		return new ResponseEntity<Double>(fare, HttpStatus.OK);
	}
	
}
