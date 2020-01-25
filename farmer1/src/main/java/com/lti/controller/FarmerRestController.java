package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Farmer;
import com.lti.model.Login;
import com.lti.model.ResponseMessage;
import com.lti.services.FarmerService;

@RestController
@RequestMapping(path = "farmer")
@CrossOrigin
public class FarmerRestController {

	@Autowired
	private FarmerService service;

	private ResponseEntity<ResponseMessage> response;
	// http://localhost:9097/farmer
//
//	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<ResponseMessage> addFarmer(@RequestBody Farmer farmer) {
//		ResponseEntity<ResponseMessage> response;
//		boolean result = service.addFarmer(farmer);
//		if (result) {
//			response = new ResponseEntity<ResponseMessage>(new ResponseMessage("farmer is  added"), HttpStatus.CREATED);
//
//		} else {
//			response = new ResponseEntity<ResponseMessage>(new ResponseMessage("farmer is not added"),
//					HttpStatus.INTERNAL_SERVER_ERROR);
//
//		}
//		return response;
//	}


	/*@RequestMapping(path="login/{emailId}/{password}" ,method=RequestMethod.GET,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseMessage> login(@PathVariable("emailId") String emailId, @PathVariable("password") String password){
		//ResponseEntity<ResponseMessage> response;

		boolean result=service.addLogin(emailId,password);
		if(result){
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("Farmer is  logged in"),HttpStatus.CREATED);
		
		}else{
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("No such farmer is there"),HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return response;
}*/
	
	@RequestMapping(path="login" ,method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseMessage> login(@RequestBody Login login){
		//ResponseEntity<ResponseMessage> response;
		boolean result=service.addLogin(login);
		if(result){
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("Farmer is  logged in"),HttpStatus.CREATED);
		
		}else{
			response=new ResponseEntity<ResponseMessage>(new ResponseMessage("No such farmer is there"),HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		return response;
}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseMessage> HandlerException(Exception ex) {
		ResponseEntity<ResponseMessage> error = new ResponseEntity<ResponseMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
		return error;
	}
}
