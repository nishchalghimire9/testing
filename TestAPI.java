package Test.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class TestAPI {

	@GetMapping(value = "/hello")
	public String Testing() {
		return "Hello, Pragyan Dai. I am able to call my Rest API Applic"
				+ "ation from the Google cloud. Try yourself tomorrow it's super exciting";
		
	}
	
	
	
}
