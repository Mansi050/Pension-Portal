package com.cts.code.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.code.entity.AuthenticationRequest;
import com.cts.code.entity.PensionDetail;
import com.cts.code.entity.PensionerDeatil;
import com.cts.code.proxy.PortalAuthProxy;
import com.cts.code.proxy.PortalPensionerDetailProxy;
import com.cts.code.proxy.PortalProcessPensionProxy;

@RestController
@CrossOrigin(origins = "*")
public class PortalProcessController {
	
	Logger logger = LoggerFactory.getLogger(PortalProcessController.class);
	
	@Autowired
	PortalAuthProxy portalAuthProxy;
	
	@Autowired
	PortalPensionerDetailProxy portalPensionerDetailProxy ;
	
	@Autowired
	PortalProcessPensionProxy portalPensionProxy;
	
	@GetMapping("/get-health")
	public ResponseEntity<?> healthCheckMethod() {
		logger.debug("Health check method");
		return ResponseEntity.ok("Health check successful");
	}
	
	@PostMapping("/portal/login")
	public ResponseEntity<?> login(@RequestBody AuthenticationRequest authRequest){
		
		ResponseEntity<?> login = portalAuthProxy.login(authRequest);	
		 return login;
	}
	
	@GetMapping("/portal/{adharCard}")
	public PensionDetail getValue(@RequestHeader(name="Authorization") String token, @PathVariable("adharCard") Long adharCard) throws Exception{
		PensionerDeatil retrieveDetail = portalPensionerDetailProxy.retrieveDetail(token, adharCard);

		PensionDetail value = portalPensionProxy.getValue(token, adharCard);
		logger.info("Ended");
		
		return value;
	}
	
	
	

}
