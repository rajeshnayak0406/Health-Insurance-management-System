package com.ait.his.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ControllerClass {
	@Autowired
	private ServiceClass ser;
	
	@GetMapping("/ssn/{ssno}")
	public ResponseEntity<String> statename(@PathVariable String ssno){
		String state=ser.getsatename(ssno);
		
		return new ResponseEntity<String>(state, HttpStatus.OK);
	}
	
	@GetMapping("/check1")
	public ResponseEntity<String> getmap(){
		
		
		return new ResponseEntity<>("Yes check1", HttpStatus.OK);
	}
	
	

}
