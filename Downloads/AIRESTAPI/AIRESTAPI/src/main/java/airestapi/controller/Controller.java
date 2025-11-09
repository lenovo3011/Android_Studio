package airestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import airestapi.entity.response;
import airestapi.service.Service_AI;
import airestapi.service.Service_REST;

@RestController
public class Controller {
	@Autowired
	Service_REST service ;
	@Autowired
	Service_AI service2 ;
	
	@GetMapping("/")
	public java.util.List<airestapi.entity.response> getAll() {
		return service.getAll() ; 
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<response>getOneRes(@PathVariable int  id ) {
		return service.getOneRes( id ) ;
	}
	
	
	@PostMapping("/") 
	public ResponseEntity<response> postEntry(@RequestBody response res) {
		return service.postEntry(res) ;
	}
	
	@PostMapping("/genai")
	
	public String genAI(@RequestBody String prompt)  {
		return service2.genAI(prompt);
		
	}
	
	
	

}
