package com.employee.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDetails;

import jakarta.websocket.server.PathParam;

/*
 * It is a class level annotation
 * It is the combination of @Component annotation
 * It is used to specify the class is used to handle the request and response
 * It is also used to create bean for controller classes
 */
//@Controller
//@ResponseBody

/*
 * @RestController is the combination of @Controller and @ResponseBOdy annotation
 * -> It is used to specify that the class is used to handle request and response
 * -> It is also used to convert Java Object into JSON(JavaScript Object Notation) Object
 */
@RestController
public class EmployeeController {

	/*
	 * @PostMapping is used to create an API or end-point to handle the POST request
	 * or Insert request
	 * 
	 * @RequestBody is used to convert JSON Object into Java Object which is sent as
	 * a request. It is applied to method parameters.
	 */
	@PostMapping("/registration")
	public String employeeRegistration(@RequestBody EmployeeDetails employeeDetails) {
		return employeeDetails.getEmail();
	}

	/*
	 * @GetMapping is used to create an API or end-point to handle the GET request
	 * or Select request
	 * 
	 * URL 1) Query String 2) Path Parameters
	 */
	/*
	 * The data that is sent to a method handling an HTTP GET request can be passed
	 * through the URL in two ways: 1) Query String 2) URL Path (PathParam).
	 * 
	 * If the data is sent through a Query String, it is added after the API or
	 * end-point using a question mark (?). The data is stored in key-value pairs.
	 * 
	 * Syntax:- http://localhost:8080/employeelogin?emailid-abc@gmail.com &
	 * password=1234
	 * 
	 * Here: key -> email value -> abc@gmail.com
	 * 
	 * key -> password value -> 1234
	 * 
	 * To retrieve values from the Query String in Spring Boot, we use
	 * the @RequestParam annotation.
	 * 
	 * @RequestParam is applied to method parameters.
	 */
	@GetMapping("/emplogin")
	public void employeeLoginByUsingEmailAndPassword(@RequestParam("emailId") String emailId,
			@RequestParam("password") String password) {

	}

	/*
	 * @PutMapping is used to create an API or end-point to handle the Put request
	 * or Update request
	 */
	@PutMapping("/updatesalary")
	public void updateEmployeeSalaryByUsingMobileNumber() {

	}

	/*
	 * Query String PathParam or PathVariable
	 * localhost:8080/deleteemployee/abc@gmail.com
	 * 
	 * @DeleteMapping is used to create an API or end-point to handle the DELETE
	 * request or Delete request
	 */
	/*
	 * The data that is sent to a method handling an HTTP DELETE request can also be passed through the URL path itself.
	 * This is called a Path Parameter (or Path Variable).
	 * In this case, the value is sent as part of the URL pattern instead of using a key and value pair or query string.
	 * 
	 * Syntax: http://localhost:8080/deleteemployee/dinga@gmail.com
	 * Here: Path Variable -> dinga@gmail.com
	 * 
	 * To retrieve values from the URL path in Spring Boot, we use the @PathVariable annotation.
	 * 
	 * @PathParam is applied to method parameters.
	 */
	@ResponseBody
	@DeleteMapping("/deleteemployee/{emailId}")
	public String deleteEmployeeDetailsByUsingEmail(@PathParam("emailId") String emailId) {
		return emailId;
	}
	
	@DeleteMapping("/deleteemployeebymobilenumberandpassword")
	public void deleteEmployeeByMobileNumberAndPassword(@RequestParam long mobileNumber, @RequestParam String password) {
		
	}

	@ResponseBody
	@GetMapping("/getallemployees")
	public String getAllEmployeeDetails() {
		return "All Employee Details";
	}

}
