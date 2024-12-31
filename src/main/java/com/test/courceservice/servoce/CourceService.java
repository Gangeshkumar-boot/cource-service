package com.test.courceservice.servoce;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.courceservice.model.CourceModel;
import com.test.courceservice.repository.CourceRepository;

@Service
public class CourceService {
	
	private CourceRepository courceRepository;

	public CourceService(CourceRepository courceRepository) {
		this.courceRepository = courceRepository;
	}
	
	public CourceModel registorCource(CourceModel courceRequest){
		
		CourceModel courceResponse = courceRepository.save(courceRequest);
		
		return courceResponse;
		
	}

	public CourceModel getCourceById(String id) {

		CourceModel courceResponse = courceRepository.findById(id).orElseThrow();
		
		return courceResponse;
	}
	
	

}
