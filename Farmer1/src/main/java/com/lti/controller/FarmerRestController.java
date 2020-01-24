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

	import com.lti.model.Farmer;
import com.lti.services.FarmerService;



	@RestController
	@RequestMapping(path = "students")
	@CrossOrigin 
	public class FarmerRestController {
		@Autowired
		private FarmerService service;

	/*	// http://localhost:9090/students
		@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Student> findAllStudents() {
			List<Student> students = service.ViewAllStudents();
			return students;
		}

		// http://localhost:9090/students/100
		@RequestMapping(path = "{rollno}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
		public Student findStudentByRollNumber(@PathVariable("rollno") int rollNumber) {
			System.out.println("student roll number"+rollNumber);
			Student student = service.findStudentByRollNumber(rollNumber);
			return student;
		}*/

		// http://localhost:9091/farmer
		@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<String> addStudent(@RequestBody Farmer farmer) {
			ResponseEntity<String> response;
			boolean result=service.addStuden(farmer);
			if(result){
				response=new ResponseEntity<String>("student is added.",HttpStatus.CREATED);
			}else{
				response=new ResponseEntity<String>("student is not added",HttpStatus.INTERNAL_SERVER_ERROR);
			}
			return response;
		}
		/*
		
		@ExceptionHandler(Exception.class)
		public ResponseEntity<String> handleException(Exception ex){
			ResponseEntity<String> error=new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
			return error;
		}

		// http://localhost:9090/students/delete/100
		@RequestMapping(path = "/delete/{roll}", method = RequestMethod.GET)
		public void deleteStudentByRollNumber(@PathVariable("roll") int rollNumber) {
			service.deleteStudentByRollNumber(rollNumber);
		
		}

		// http://localhost:9090/students/update/101
		@RequestMapping(path = "/update/{rollno}/{name}", method = RequestMethod.POST)
		public int updateStudentByRollNumber(@PathVariable("rollno") int rollNumber,@PathVariable("name") String studentName) {
			int result = service.updateStudentByRollNumber(rollNumber, studentName);
			return result;
		}
		
		//http://localhost:9090/students/updatebyscore/101
		@RequestMapping(path="/upadtebyscore/{roll}/{score}", method=RequestMethod.POST)
		public int updateStudentByScore(@PathVariable("roll") int rollNumber,@PathVariable("score") double studentScore){
			System.out.println("update by score");
			int result=service.updateStudentByStudentScore(rollNumber, studentScore);
			return result;	
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	}



