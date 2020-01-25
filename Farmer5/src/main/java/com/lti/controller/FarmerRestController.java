package com.lti.controller;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.MediaType;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Crop;
import com.lti.model.DetailsBidder;
import com.lti.model.Login;
import com.lti.services.FarmerService;



	@RestController
	@RequestMapping(path = "farmer")
	@CrossOrigin 
	public class FarmerRestController {
		@Autowired
		private FarmerService service;
		@Autowired
		//http:localhost//9097/farmer/detailsFarmer
		@RequestMapping(path="Login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> addCrop(@RequestBody Login farmer) {
			ResponseEntity<String> response;
			boolean result=service.addLogin(farmer);
			if(result){
				response=new ResponseEntity<String>("crop is added.",HttpStatus.CREATED);
			}else{
				response=new ResponseEntity<String>("crop is not added",HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return response;
		}
	
		
		
		
		
		
		
		
		
		
		
	}



