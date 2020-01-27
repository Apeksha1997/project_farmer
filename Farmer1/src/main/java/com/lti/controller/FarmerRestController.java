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

import com.lti.model.DetailsFarmer;
import com.lti.services.FarmerService;



	@RestController
	@RequestMapping(path = "farmer")
	@CrossOrigin 
	public class FarmerRestController {
		@Autowired
		private FarmerService service;
		
		//http:localhost//9097/farmer/detailsFarmer
		//@Autowired
		@RequestMapping(path="detailsFarmer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> addFarmerdetails(@RequestBody DetailsFarmer farmer) {
			ResponseEntity<String> response;
			boolean result=service.addFarmerDetails(farmer);
			if(result){
				response=new ResponseEntity<String>("detalis of farmer is added.",HttpStatus.CREATED);
			}else{
				response=new ResponseEntity<String>(" details of farmer is not added.",HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return response;
		}
	
		
		
		
		
		
		
		
		
		
		
	}



