package com.Govt.AdharData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Govt.AdharData.entity.Adhar;
import com.Govt.AdharData.globalexceptions.AdharNotValid;
import com.Govt.AdharData.service.AdharService;

@RestController
@RequestMapping(value="/adhar")
public class AdharController {
	
	@Autowired
	AdharService service;
	
	@PostMapping(value="/saveAdhar")
	public ResponseEntity<String> saveAdhar(@RequestBody Adhar adhar) throws Exception{
		
		Boolean b= service.saveAdhar(adhar);
		
		if(b==true) {
			return new ResponseEntity<String>("saved!!",HttpStatus.CREATED);
		}
		else {
			 return new ResponseEntity<String>("Not saved!!",HttpStatus.NOT_ACCEPTABLE);
		}
		
	}

}
