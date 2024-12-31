package com.test.courceservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.courceservice.model.CourceModel;
import com.test.courceservice.servoce.CourceService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/cources")
public class CourceController {
	
	private CourceService courceService;
	
	public CourceController(CourceService courceService) {
		this.courceService = courceService;
	}

	@PostMapping
	public ResponseEntity<CourceModel> registorCource(@RequestBody CourceModel courceRequest){
		log.info("Request for cource:",courceRequest);
		
		CourceModel courceResponse = courceService.registorCource(courceRequest);
		
		return new ResponseEntity<>(courceResponse, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CourceModel> getCourceById(@PathVariable("id") String id){
		log.info("Get cource by id:",id);
		
		CourceModel courceResponse = courceService.getCourceById(id);
		
		return new ResponseEntity<>(courceResponse, HttpStatus.OK);
	}

}
