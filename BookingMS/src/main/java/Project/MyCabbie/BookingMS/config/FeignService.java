package Project.MyCabbie.BookingMS.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "FARECALCULATIONMS") // The name of the service registered in Eureka
public interface FeignService {
	
	@GetMapping("/fare")
    ResponseEntity<Double> calculateFare(@RequestParam Integer rate,
            @RequestParam Integer distance);
	
}
