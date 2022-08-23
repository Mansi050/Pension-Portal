package com.cts.code.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.code.entity.AuthenticationRequest;

@FeignClient(name = "authorization-microservice", url="localhost:8083")
public interface PortalAuthProxy {
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthenticationRequest authRequest);

}
