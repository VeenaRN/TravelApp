package coms.SampleRestApiApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	@GetMapping("/test")
	public String DemoMethod()
	{
		return "This is rest sample method";
	}
	@GetMapping("/strs")
	public List<String> getStrgs()
	{
		List<String> lstStr =new ArrayList<String>();
				lstStr.add("Java");
				lstStr.add("SQL");
				lstStr.add("Angular");
				lstStr.add("BootStrap");
	
	return lstStr;
	}
	
	@GetMapping("getinfo")
	public ResponseEntity<List<String>> getAll() //used for status codes
	{
		List<String> lstStr =new ArrayList<String>();
		lstStr.add("Java");
		lstStr.add("SQL");
		lstStr.add("Angular");
		lstStr.add("BootStrap");

        return new ResponseEntity<List<String>>(lstStr,HttpStatus.ACCEPTED)	;
	}
}

//http://localhost:9090/api/v1/test
